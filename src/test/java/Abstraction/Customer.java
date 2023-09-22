package Abstraction;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void purchase(Product product) {
        System.out.println(name + " purchased the following product:");
        product.displayInfo();
        System.out.println();
    }
}