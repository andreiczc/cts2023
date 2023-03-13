package ro.ase.cts.lab3;

public class Product {

    /*
    4 Product types:
    NEW,
    DISCOUNTED,
    SALE,
    FINAL_SALE
     */

    /*
    1. Naming conventions
    2. Magic numbers
     */

    private static final int MAX_AGE_FOR_DISCOUNT = 10;
    private static final float MAX_DISCOUNT = 0.15f;

    public float computeFinalPrice(ProductType type, float initialPrice, int productAge) {
        if(initialPrice <= 0 || productAge <= 0) {
            throw new IllegalArgumentException();
        }

        if(type == ProductType.NEW) {
            return initialPrice;
        }

        // if the product is older than 10 yo, apply maximum discount; otherwise, productAge / 100
        float ageDiscount = (productAge > MAX_AGE_FOR_DISCOUNT)
                ? MAX_DISCOUNT
                : (float) productAge / 100;

        // cost = 100, age = 5, type = DISCOUNTED
        // 90 - ( 0.05 * 90)

        float result = initialPrice - (initialPrice * type.getDiscountValue());
        result *= (1 - ageDiscount);

        return result;
    }
}
