package encp;

public class EncapsulationECommerceExample {
    public static void main(String[] args) {
        // Create a Product object with encapsulated data
        Product product1 = new Product("Laptop", 999.99);

        // Create a Customer object with encapsulated data
        Customer customer1 = new Customer("Ram", "ram@example.com");

        // Access and display product and customer details using getter methods
        System.out.println("Product Details:");
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: ₹" + product1.getPrice());

        System.out.println("Customer Details:");
        System.out.println("Name: " + customer1.getName());
        System.out.println("Email: " + customer1.getEmail());
    }
}
