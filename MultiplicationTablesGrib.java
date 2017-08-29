import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTablesGrib
{
    public static void main(String[]args)
  {


      Scanner keyboard = new Scanner (System.in);
      out.println("Welcome to Multiplicaion Tables");
      out.println("what size would you like to print this Multiplication Grid?(no bigger than 20)"); 
      int Size = keyboard.nextInt();
      
        out.print("    "); 
        for (int row = 0; row <= Size;row++)

          if(row <10)
            out.print(" "+ row + "");
            out.println();
        for ( int col=0; col <=Size; col++){
            for(int row=0; row<=Size; row++){
                int result = row * col; 
                if(result <10)


                out.print(" " + result + " ");


                else if (result <100)


                  out.print(result + " ");

            }
            out.println("");
        }
    }
} 
             
             
         
    
