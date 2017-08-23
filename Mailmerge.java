import static java.lang.System.out;
import java.util.Scanner;

public class Mailmerge
{
    public static void main (String [] args)
    {
    Scanner keyboard = new Scanner(System.in);
    
    String name = "";
    float donation;
    boolean keepGoing = true;
   
    System.out.println("Thank You Letters");
    System.out.println("");
    
    while (keepGoing== true)
    {
      
      System.out.print("Please enter the donor's  full name. ");
      name = keyboard.nextLine();
      if (name.equals("quit")){ 
          out.println ("Thank you for the donation");
          System.exit(0);
      }
      
      System.out.print("Please enter the donation amount. ");
      donation = keyboard.nextFloat();
      keyboard.nextLine ();
      
        System.out.println ("Dear " + name +"\n");
        
        System.out.println (" Thank you for your donation!\n");
        System.out.println (" We rely on donors like you to keep our organization effective, and you came through for us. ");
        System.out.println ("Your donation of $ " + donation + " will help our efforts to make a difference in the world. \n"); 
        
        System.out.print ("As you may know, we are a registered non-profit organization,");
        System.out.println ("so your donation is tax deductible.");
        System.out.println ("You may use this letter as a recipt for taz purposes.\n");

        System.out.println ("Thank you again for your support!\n");

        System.out.println ("Sincerely,");
        System.out.println ("Paula Jones");
        System.out.println ("YourCharity.org \n");
    }
}
}

    
   
        