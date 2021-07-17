/*   throw keyword is used for unchecked Exception if we use for checked Exception
the program will not compails and mainly used for userdefind Exceptions(if programmer want to defind a Exception 
we use this keyword.In certain cases we have to raise Exception so in that case we use "throw" keyword  )  */
/*  to hand over our created Exception to the JVM manually */


// Saving--> RuntimeException-->Exception--->Throable; so we use super keyword to make visible of ower Exception
// Unchecked Exception is used for our own created Defined Exceptions so that we can avoid useing try catch.
import java.util.*;
class Saving extends RuntimeException
{
   public Saving(String s)
    {
        super(s);
    }
}
class Current extends RuntimeException
{ 
    public Current(String s)
    {
        super(s);
    }
}
class AccountOpen
{
    public static void main(String[]args)
    {
        int Amount;
        String c;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the Account type :");
        c = sc.nextLine();
        if(c.equals("saving"))
            {
                System.out.print(" How much Amount : ");
                Amount = sc.nextInt();
                if(Amount < 1000)
                throw new Saving(" AMOUNT MUST BE MORE THAN (OR) EQUAL TO 1000 ");
                else
                System.out.println( " WELCOME TO OPEN SAVING ACCOUNT " );
            }
        else if(c.equals("current"))
            {
                System.out.print(" How much Amount : ");
                Amount = sc.nextInt();
                if(Amount < 5000)
                throw new Current(" AMOUNT MUST BE MORE THAN (OR) EQAUL TO 5000 ");
                else
                System.out.println(" WELCOME TO OPEN CURRENT ACCOUNT ");
            }
    }
}
