import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1=new Item("mocha",4.1);
        Item item2=new Item("latte",2.1);
        Item item3=new Item("drip coffe",3.1);
        Item item4=new Item("capuccino",5.1);
        // Order variables -- order1, order2 etc.
        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order("ahmed");
        Order order4=new Order("aziz");
        Order order5=new Order("ali");
        // Application Simulations
        order1.addItem(item3);
        order1.addItem(item2);
        order2.addItem(item1);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
