package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNum 
{
	public static void main(String[] args) {
		
		int  n,rem,rev=0;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter the Number");
            n =Integer.parseInt(sc.next());

        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println(" Invalid Input ");

            System.out.print("Enter the Number");
            n =Integer.parseInt(sc.next());
        }
        
        while(n!=0)
        {
        	rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;
        }
        System.out.println(" Reverse Number : "+rev);
    }
	
}
