import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1=new Item();
        Item item2=new Item();
        Item item3=new Item();
        Item item4=new Item();
        item1.name = "mocha";
        item1.price=4.1;
        item2.name = "latte";
        item2.price=2.1;
        item3.name = "drip coffe";
        item3.price=5.1;
        item4.name = "capuccino";
        item4.price=3.1;
        // Order variables -- order1, order2 etc.
        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order();
        Order order4=new Order();
        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noah";
        order4.name="Sam";
        // Application Simulations
        System.out.println(order1);
        order2.items=new ArrayList<Item>();
        order3.items=new ArrayList<Item>();
        order4.items=new ArrayList<Item>();
        order2.items.add(item1);
        order2.total+=item1.price;
        order3.items.add(item4);
        order3.total+=item4.price;
        order4.items.add(item2);
        order4.total+=item2.price;
        order1.ready=true;
        order4.items.add(item2);
        order4.total+=item2.price;
        order2.ready=true;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);//0
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
