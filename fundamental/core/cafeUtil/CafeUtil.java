import java.util.ArrayList;

public class CafeUtil{

    public static int  getStreakGoal(int numWeeks ){
        int sum = 0;
        for (int i=0;i<=numWeeks;i++){
            sum+=i;
        }
        return sum;
    }
    public static double  getOrderTotal(double[] prices){
        double sum = 0;
        for (int i=0;i<prices.length;i++){
            sum+=prices[i];
        }
        return sum;
    }
    public static void displayMenu(ArrayList<String> menuItems){
        for (int i=0;i<menuItems.size();i++){
            String name = menuItems.get(i);
            System.out.println(i+" "+name); 
        }
    }
    public static void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:"); 
        String userName = System.console().readLine();
        System.out.println("Hello, "+ userName ); 
        System.out.println( "There are "+customers.size()+" people in front of you");
        customers.add(userName);
        System.out.println(customers); 
    }
}