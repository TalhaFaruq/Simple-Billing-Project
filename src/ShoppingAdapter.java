import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingAdapter implements IShopper {
    List<BillDetails> products = new ArrayList<>();

    @Override
    public void getProductDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of products:");
        int j = input.nextInt();

        for (int i = 0; i < j; i++) {
            BillDetails billDetails = new BillDetails();
            System.out.println("Enter ID");
            billDetails.setProductID(input.nextLong());
            System.out.println("Enter Name");
            billDetails.setProductName(input.next());
            System.out.println("Enter Price");
            billDetails.setProductPrice(input.nextInt());
            System.out.println("Enter Quantity");
            billDetails.setProductQuantity(input.nextInt());

            //The price of the product calculated with quantity
            billDetails.setTotalProductPrice(billDetails.getProductPrice() * billDetails.getProductQuantity());

            products.add(billDetails);
        }
    }

    @Override
    public void calculateBill() {
        //Stream which will get the sum of the object in the list
        int totalPrice = products.stream().mapToInt(BillDetails::getTotalProductPrice).sum();
        double discountedPrice = (totalPrice * 0.15) - totalPrice;
        System.out.println("Total price = " + totalPrice + " and after discount the price = " + discountedPrice);
    }

    @Override
    public void printBill() {
        calculateBill();
    }
}
