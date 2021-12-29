import java.util.Scanner;

public class Customer implements ICustomer {
    CustomerDetails customerDetails = new CustomerDetails();

    @Override
    public void getCustomerDetails() {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter ID:");
        customerDetails.setCustomerID(1L);
//        System.out.println("Enter Name:");
        customerDetails.setCustomerName("Talha");
//        System.out.println("Enter Address");
        customerDetails.setCustomerAddress("Islamabad");
//        System.out.println("Enter Contact Number:");
        customerDetails.setCustomerContact(02342342234);
//        System.out.println("Enter Email");
        customerDetails.setCustomerEmail("talha@gmail.com");
//        System.out.println("Enter PanCard Number");
        customerDetails.setPanCardNumber(2134125L);
//        System.out.println("Enter Aadhar Card Number");
        customerDetails.setAadharCard_Number(493753L);
    }

    @Override
    public void printCustomerDetails() {
        System.out.println(customerDetails);
    }
}
