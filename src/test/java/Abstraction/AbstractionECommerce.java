package Abstraction;


public class AbstractionECommerce {
    public static void main(String[] args) {
        // Create some products
        Product laptop = new Electronics("Laptop", 999.99, "Dell");
        Product tShirt = new Clothing("T-Shirt", 19.99, "Large");
        Product Mobile = new Electronics("Mobile",19000,"Google");

        // Create customers
        Customer customer1 = new Customer("Ram");
        Customer customer2 = new Customer("Sam");

        // Customers make purchases
        customer1.purchase(laptop);
        customer2.purchase(tShirt);
        customer2.purchase(Mobile);
    }
}