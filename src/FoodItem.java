public class FoodItem {

    private int foodId;
    private String itemName;
    private double itemPrice;

    public FoodItem(){

    }

    public FoodItem(int foodId, String itemName, double itemPrice) {
        this.foodId = foodId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return itemName + " (₹" + itemPrice + ")";
    }
}
