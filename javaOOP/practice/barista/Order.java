import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name="Guest";
        this.items= new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name=name;
        this.items= new ArrayList<Item>();
    }
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    public void addItem(Item oneitem){
        this.items.add(oneitem);
    }
    public String getStatusMessage(){
        if(this.ready){
            return  "Your order is ready.";
        }else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double sum = 0;
        for (int i=0;i<this.items.size();i++){
            sum+=this.getItems().get(i).getPrice();
        }
        return sum;
    }
    public void display(){
        System.out.println("Customer Name: "+this.name);
        for (int i=0;i<this.items.size();i++){
            Item oneitem=this.getItems().get(i);
            System.out.println(oneitem.getName()+ " - "+oneitem.getPrice());
        }
    }
    // GETTERS & SETTERS
    // getter
    public String getName() {
        return this.name;
    }
    // setter
    public void setName(String name) {
        this.name = name; 
}
// getter
    public boolean getReady() {
        return this.ready;
    }
    // setter
    public void setReady(boolean ready) {
        this.ready = ready; 
}
// getter
    public ArrayList<Item> getItems() {
        return this.items;
    }
    // setter
    public void setItems(ArrayList<Item> itemsList) {
        this.items=itemsList; 
}
}

