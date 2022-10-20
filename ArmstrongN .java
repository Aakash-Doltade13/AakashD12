package p2;
import java.util.InputMismatchException;
import java.util.Scanner;

class ArmstrongN
{
    public static void main(String[] args)
    {

        int arm=0,n,temp,rem;
        Scanner sc =new Scanner(System.in);
        try
        {
        	
         System.out.print("Enter the Number");
          n =Integer.parseInt(sc.next());
        
        }
        catch(InputMismatchException | NumberFormatException e)
        {
        	e.printStackTrace();
        	 
        	System.out.println(" Invalid Input ");
        	
        	System.out.print("Enter the Number");
         n =Integer.parseInt(sc.next());
         
         
        }
        
        temp =n;

        while(n>0)
        {
            rem=n% 10;
            arm =(rem*rem*rem)+arm;
            n = n /10;
        }
        if (temp==arm)
        {
            System.out.print(temp + " It is a Armstrong Number");
        }
        else
        {
            System.out.print(temp + " It is a not Armstrong Number");
        }
    }
}
