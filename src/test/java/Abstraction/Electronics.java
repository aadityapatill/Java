package Abstraction;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Product: " + getName());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Brand: " + brand);
    }
}