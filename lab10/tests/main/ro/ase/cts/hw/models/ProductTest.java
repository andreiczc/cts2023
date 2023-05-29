package main.ro.ase.cts.hw.models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductTest {

    private Product product;
    private ArrayList<Integer> soldItemsWeekly;

    @Before
    public void setUp() {
        this.soldItemsWeekly = new ArrayList<Integer>();
        soldItemsWeekly.addAll(List.of(10, 3));

        this.product = new Product(
                "test", 10.0f, soldItemsWeekly
        );
    }

    @Test
    public void testGetNoWeeksAboveLimitRight() {
        // arrange
        var limit = 2;
        var expectedValue = soldItemsWeekly
                .stream()
                .filter(integer -> integer >= limit)
                .count();

        // act
        var actualValue = product.getNoWeeksAboveLimit(limit);

        // assert
        assertEquals(expectedValue, actualValue);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNoWeeksAboveLimitBoundaryLower() {
        // arrange
        var limit = -1;

        // act
        product.getNoWeeksAboveLimit(limit);    // expects to throw
                                                // UnsupportedOperationException
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNoWeeksAboveLimitBoundaryUpper() {
        // arrange
        var limit = 1001;

        // act
        product.getNoWeeksAboveLimit(limit);    // expects to throw
                                                // UnsupportedOperationException
    }

    @Test
    public void testGetNoWeeksAboveLimitInverseRelation() {
        // count(x >= limit) a
        // inverse => count(x < limit) b
        // assert => a + b = original size

        // arrange
        var limit = 5;
        var inverse = soldItemsWeekly
                .stream()
                .filter(integer -> integer < limit)
                .count();

        // act
        var actual = product.getNoWeeksAboveLimit(limit);

        // assert
        assertEquals(soldItemsWeekly.size(),
                inverse + actual);
    }

    @Test
    public void testGetNoWeeksAboveLimitError() {
        // if weeklySoldItems => 0
        // arrange
        var expected = 0;
        product.setSales(null);

        // act
        var actual = product.getNoWeeksAboveLimit(1);

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNoWeeksAboveLimitPerformance() {
        // arrange
        var expected = 50;
        var limit = 5;

        // act
        var startTime = new Date().getTime();
        product.getNoWeeksAboveLimit(limit);
        var endTime = new Date().getTime();

        // assert
        assertTrue(endTime - startTime < expected);
    }

    @Test
    public void testConstructorWithThreeParameters() throws NoSuchFieldException, IllegalAccessException {
        var expectedName = "test";
        var expectedPrice = 10.0f;
        var expectedSoldItems = new ArrayList<Integer>();
        expectedSoldItems.addAll(soldItemsWeekly);

        var product = new Product(expectedName, expectedPrice, expectedSoldItems);

        var nameField = Product.class.getDeclaredField("name");
        var actualName = nameField.get(product);

        assertEquals(
                expectedName, actualName
        );

        var priceField = Product.class.getDeclaredField("price");
        var actualPrice = priceField.get(product);

        assertEquals(
                expectedPrice, actualPrice
        );
    }

}
