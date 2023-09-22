package Abstraction;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + getName());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Size: " + size);
    }
}
