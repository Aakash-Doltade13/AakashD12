package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNum
{
    public static void main(String[] args)
    {
        int  n,count=0;
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
        for (int i=1;i<=n;i++)
        {
            if (n % i == 0)
            {

                count++;
        }
        }
        if(count==2)
        {
            System.out.println(n + " is the Prime Number");
        }
        else
        {
            System.out.println(n + " is the Not a Prime Number");

        }
    }
}
