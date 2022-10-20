package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddNatural
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Input Number Of Terms For Odd Natural Number:");
            n = Integer.parseInt(sc.next());
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter Valid Input");
            System.out.println("Input Number Of Terms For Odd Natural Number:");
            n = Integer.parseInt(sc.next());
        }
        int sum = 0;
        System.out.print("The odd numbers are:");
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.print("\n");
        System.out.println("The Sum of Odd Natural Number Upto "+ n+" Terms : " + sum);
    }
}
