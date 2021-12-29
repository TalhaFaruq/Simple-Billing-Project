import java.util.Scanner;

public class Customer implements ICustomer {
    CustomerDetails customerDetails = new CustomerDetails();

    @Override
    public void getCustomerDetails() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID:");
        customerDetails.setCustomerID(input.nextLong());
        System.out.println("Enter Name:");
        customerDetails.setCustomerName(input.next());
        System.out.println("Enter Address");
        customerDetails.setCustomerAddress(input.next());
        System.out.println("Enter Contact Number:");
        customerDetails.setCustomerContact(input.nextInt());
        System.out.println("Enter Email");
        customerDetails.setCustomerEmail(input.next());
        System.out.println("Enter PanCard Number");
        customerDetails.setPanCardNumber(input.nextLong());
        System.out.println("Enter Aadhar Card Number");
        customerDetails.setAadharCard_Number(input.nextLong());
    }

    @Override
    public void printCustomerDetails() {
        System.out.println(customerDetails);
    }
}
