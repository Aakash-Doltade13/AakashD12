package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args)
    {
    	int n,sum,d,temp,fact;
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

         sum = 0;
        temp = n;

        while (n != 0) 
        {
            fact = 1;
            d = n % 10;

            for (int i = 1; i <= d; i++)
            {
                fact = fact * i;

            }
            sum = sum + fact;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.print(temp+ "Is a Strong Number :");
        } else {
            System.out.print(temp+ " Is Not a Strong Number: ");
        }
    }
}