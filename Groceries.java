
import static java.lang.System.out;
import java.util.Scanner;

public class Groceries
{
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);

        String Item="";

        out.println("What is your grocery list items? ");
        
        out.println ("Item 1?");
        String Item1=keyboard.nextLine();
       
        out.println("Item 2?");
        String Item2=keyboard.nextLine();
        
        out.println( "Item 3?");
        String Item3=keyboard.nextLine();
        
        int quantityItem=4;
        
        out.println ("Please enter the quantity of each item");
        out.println ("How many " + Item1 + " ?");
        int quantity1Item=keyboard.nextInt();
        
        out.println ("How many " + Item2 + " ?");
        int quantity2Item=keyboard.nextInt();
         
        out.println ("How many "+ Item3 + " ?");
        int quantity3Item=keyboard.nextInt();
        
        float ItemCost = 2.15f;
        
        out.println (" Please enter the price of each item");
        out.println ("How much does " + Item1 + " cost ?");
        float Item1Cost=keyboard.nextFloat();
        
        out.println ("How much does " + Item2 + " cost ?");
        float Item2Cost=keyboard.nextFloat();
        
        out.println ("How much does " + Item3 + " cost ?");
        float Item3Cost=keyboard.nextFloat();
        
        float total=3.5f;
        
        total= (quantity1Item * Item1Cost) + (quantity2Item * Item2Cost) + (quantity3Item * Item3Cost);
        out.print ("Your total cost is $ " + total);
     
         
    }    
}     

        
        
