public class Order {

    private int orderId;
    private String orderStatus;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderStatus = "PLACED";
    }

    public void acceptOrder() {
        orderStatus = "ACCEPTED";
        System.out.println("Order " + orderId + " accepted");
    }

    public void rejectOrder() {
        orderStatus = "REJECTED";
        System.out.println("Order " + orderId + " rejected");
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId +
                ", status=" + orderStatus +
                ", total=₹" + totalAmount + "}";
    }
}
