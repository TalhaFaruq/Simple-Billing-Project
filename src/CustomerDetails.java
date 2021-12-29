public class CustomerDetails {
    Long CustomerID;
    String CustomerName;
    String CustomerAddress;
    int CustomerContact;
    String CustomerEmail;
    Long PanCardNumber;
    Long AadharCard_Number;

    public Long getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Long customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public int getCustomerContact() {
        return CustomerContact;
    }

    public void setCustomerContact(int customerContact) {
        CustomerContact = customerContact;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public Long getPanCardNumber() {
        return PanCardNumber;
    }

    public void setPanCardNumber(Long panCardNumber) {
        PanCardNumber = panCardNumber;
    }

    public Long getAadharCard_Number() {
        return AadharCard_Number;
    }

    public void setAadharCard_Number(Long aadharCard_Number) {
        AadharCard_Number = aadharCard_Number;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "CustomerID=" + CustomerID +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerAddress='" + CustomerAddress + '\'' +
                ", CustomerContact=" + CustomerContact +
                ", CustomerEmail='" + CustomerEmail + '\'' +
                ", PanCardNumber=" + PanCardNumber +
                ", AadharCard_Number=" + AadharCard_Number +
                '}';
    }
}
