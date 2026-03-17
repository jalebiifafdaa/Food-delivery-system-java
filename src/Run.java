public class Run {
    static void main(String[] args) {
        System.out.println("Food Delivery App Started");

     Customer customer = new Customer("Harsh",111,"Gujarat","8446766500");
     FoodItem pizza  = new FoodItem(1,"Pizza",200);
     FoodItem sandwich =new FoodItem(34,"Sanwich",400);
     FoodItem pasta = new FoodItem(20,"Pasta", 150);

     Order order = new Order(5001);

     Customer.placedOder();

     double total= pizza.getItemPrice() + sandwich.getItemPrice() + pasta.getItemPrice();


        order.acceptOrder();
        order.setTotalAmount(total);
        System.out.println(customer);
        System.out.println(order);
        System.out.println(pizza);
        System.out.println(pasta);
        System.out.println(sandwich);
    }

     }


