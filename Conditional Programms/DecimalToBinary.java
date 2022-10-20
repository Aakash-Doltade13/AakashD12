package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args)
    {
        int n = 0,d;
        String bin=" ";
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("The Decimal Number : ");
            n = Integer.parseInt(sc.next());
            if (n==1 | n==0)
            {
                System.out.println("ff");
                System.out.print("The Decimal Number : ");
                n = Integer.parseInt(sc.next());
            }
            else
            {
                System.out.println(" Invalid Input ");

                System.out.print("The Decimal Number : ");
                n =Integer.parseInt(sc.next());

            }
        }
        catch(InputMismatchException | NumberFormatException e)
        {
           System.out.println(" Invalid Input ");

            System.out.print("The Decimal Number : ");
            n =Integer.parseInt(sc.next());
        }
        
       
            while (n != 0) {
                d = n % 2;
                n = n / 2;
                bin = bin + d;
            }
        
        System.out.println("The equivalent Binary Number is : " + bin );

    }


}
