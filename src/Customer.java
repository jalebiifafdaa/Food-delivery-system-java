public class Customer {

    private String customerName;
    private int customerId;
    private String customerAddress;
    private String phoneNo;

    public Customer (){

    }

    public Customer (String customerName, int customerId, String customerAddress, String phoneNo) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.phoneNo = phoneNo;
    }

    public static void placedOder() {
    }


    public void placeOrder() {
        System.out.println(customerName + " placed an order");
    }

    public void trackOrder() {
        System.out.println("Tracking order for " + customerName);
    }

    @Override
    public String toString() {
        return "Customer{id=" + customerId +
                ", name='" + customerName +
                "', phone='" + phoneNo +
                "', address='" + customerAddress + "'}";
    }
}
