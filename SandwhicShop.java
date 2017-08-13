
import static java.lang.System.out;

import java.util.Scanner;

public class SandwhicShop
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies= 50;
        int goalForBurgers= 250;
        int goalForSubs= 180;
        int goalForSoup= 70;
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwhiches is goalForVeggies");
        out.println (" How many veggies sandwhich were sold today?");
        int gVeggies = keyboard.nextInt();

        if (gVeggies >=goalForVeggies){
            out.println("Made goal for veggies.");
        }else{
            out.println ("Actaul value is less than goal");
        }

        out.println ("The sales goal for burgers is goalForBurgers");
        out.println ("How many burgers were sold today");
        int gBurgers = keyboard.nextInt();

        if (gBurgers>= goalForBurgers){
            out.println("Made goal for Burgers.");
        }else{
            out.println ("Actual value is less than goal.");
        }

        out.println ("The sales goal for subs is goalForSubs");
        out.println ("How many subs were sold today?");
        int gSubs = keyboard.nextInt();

        if (gSubs>=goalForSubs){
            out.println ("Made goal for subs.");
        }else{
            out.println ("Actual value is less than goal.");
        }

        out.println("The sales goal for soup is GoalForSoup");
        out.println("How many soups were sold today?");
        int gSoup = keyboard.nextInt();

        if (gSoup>=goalForSoup){
            out.println ("Made goal for soup.");
        }else{
            out.println ("Actual value is less than goal.");
        }

        if (gVeggies>=goalForVeggies && gBurgers>=goalForBurgers && gSubs>=goalForSubs &&
        gSoup>=goalForSoup){
            out.print("Made goal for everything!");
        }
    }

}


