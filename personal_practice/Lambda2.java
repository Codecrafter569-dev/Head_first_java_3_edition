import java.util.*;
import java.util.stream.Collectors;
class Item {
private String name;
private double price;
private int qu;

public Item(String name , double price , int qu){
this.name = name;
this.price = price;
this.qu = qu;
}
public String getName(){
return name;
}
public double getPrice(){
return price;
}
public int getQu(){
return qu;
}
public double getTotalPrice(){
return price * qu;
}
@Override
public String toString(){
return name + " (Qty: "+ qu + ",Total: $"+getTotalPrice()+")";
}
}

class  Order{
private int id;
private List<Item> items;
private String status;

public Order(int id , List<Item> items , String status){
this.id = id;
this.items = items;
this.status = status;

}
public int getId(){
return id;
}
public List<Item> getItems(){
return items;
}
public String getStatus(){
return status;
}
}

public class Lambda2{
public static void main(String args[]){
List<Order> orders = Arrays.asList(
            new Order(1, Arrays.asList(
                    new Item("Laptop", 1200.00, 1),
                    new Item("Mouse", 25.00, 2)
                ), "SHIPPED"),
            new Order(2, Arrays.asList(
                    new Item("Monitor", 300.00, 2),
                    new Item("Keyboard", 100.00, 1)
                ), "PENDING"),
            new Order(3, Arrays.asList(
                    new Item("Desk", 150.00, 1),
                    new Item("Chair", 85.00, 2)
                ), "SHIPPED")
        );

// Filter for SHIPPED orders and calculate the total cost per order with a multiline lambda
        Map<Integer, Double> totalCostPerOrder = orders.stream()
            .filter(order -> order.getStatus().equals("SHIPPED"))
            .collect(Collectors.toMap(
                Order::getId,
                order -> { // Multiline lambda to calculate total order cost
                    double totalCost = 0.0;
                    for (Item item : order.getItems()) {
                        totalCost += item.getTotalPrice();
                    }
                    System.out.println("Order ID " + order.getId() + " Total Cost: $" + totalCost);
                    return totalCost;
                }
            ));

        System.out.println("\nTotal cost for each shipped order:");
        totalCostPerOrder.forEach((id, cost) -> System.out.println("Order ID: " + id + " -> $" + cost));







}
}