package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibbonacciSeries
{
    public static void main(String[] args)
    {
        int n,a=0,b=1,c;
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
             System.out.println(a);
           System.out.println(b);

            for (int i = 2; i <= n-1; i++)
            {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }

        }

}
