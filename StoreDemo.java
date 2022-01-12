import java.util.Scanner;

/**
 * Write a description of class StoreDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoreDemo
{
    public static void main(String[] args)
    {
        Store store = new Store();
        
        Scanner s = new Scanner(System.in);
        double amountSpent;
        do
        {
            System.out.print("Enter the name of the customer (End to end): ");
            String customerName = s.next();
            
            System.out.print("Enter the amount spent by the customer (0.0 to end): ");
            amountSpent = s.nextDouble();
            
            if(amountSpent != 0.0)
            {
                store.addSale(customerName, amountSpent);
            }
        }
        while(amountSpent != 0.0);
        
        System.out.println("Best customer: " + store.nameOfBestCustomer());
    }
}