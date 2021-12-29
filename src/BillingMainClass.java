public class BillingMainClass {

    public static void main(String[] args) {

        Customer customer = new Customer(); //Initiating the customer object
        customer.getCustomerDetails();  //Take the details of the customer
        customer.printCustomerDetails();  //Print out the details of the customer

        
        ShoppingAdapter shoppingAdapter = new ShoppingAdapter(); //Initiating the shoppingAdapter object
        shoppingAdapter.getProductDetails(); //Take the details of the product
        shoppingAdapter.calculateBill(); // Calculate the bill
        shoppingAdapter.printBill(); // Print Bill of the products
    }
}
