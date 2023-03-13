package ro.ase.cts.lab3;

public enum ProductType {
    NEW(0),
    DISCOUNTED(0.1f),
    SALE(0.25f),
    FINAL_SALE(0.35f);

    private float discountValue;

    ProductType(float discountValue) {
        this.discountValue = discountValue;
    }

    public float getDiscountValue() {
        return discountValue;
    }
}
