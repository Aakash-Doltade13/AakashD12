package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeOfPrime {
    public static void main(String[] args)
    {
        int i,n,nth,temp,count=0;
        boolean counter;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Starting Number here");
            n =  Integer.parseInt(sc.next());

            System.out.print("Enter  nth Number here");
            nth =  Integer.parseInt(sc.next());
        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println(" Invalid Input ");

            System.out.println("Please Enter valid input Again");
            System.out.print("Enter Starting Number here");
            n =  Integer.parseInt(sc.next());

            System.out.print("Enter  nth Number here");
            nth =  Integer.parseInt(sc.next());
        }

        System.out.println("List of prime numbers between " + n + " and " + nth);
        temp = n;
        if(n % 2 == 0) {
            n++;
        }

        for(i = n; i <= nth; i = i + 2) {
            counter = false;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    counter = true;
                    break;
                }
            }
            if(!counter) {
                System.out.println(i);
                count++;
            }
        }










    }
}
