package ro.ase.cts.lab3;

public class Application {

    public static void main(String[] args) {
        Product instance = new Product();
        float result = instance.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
        System.out.printf("The result is %f\n", result);
    }

}
