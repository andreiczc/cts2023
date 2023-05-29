package main.ro.ase.cts.hw.models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    private Product product;
    private ArrayList<Integer> soldItemsWeekly;

    @Before
    public void setUp() {
        this.soldItemsWeekly = new ArrayList<Integer>();
        soldItemsWeekly.addAll(List.of(10, 10));

        this.product = new Product(
                "test", 10.0f, soldItemsWeekly
        );
    }

    @Test
    public void testGetNoWeeksAboveLimitRight() {
        // arrange
        var limit = 5;
        var expectedValue = soldItemsWeekly
                .stream()
                .filter(integer -> integer > limit)
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


    }

}
