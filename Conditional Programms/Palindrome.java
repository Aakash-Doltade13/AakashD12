package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        int n,d,rev=0,temp;
    Scanner sc=new Scanner(System.in);
    try
    {
        System.out.print("Enter the Number");
        n =Integer.parseInt(sc.next());

    }
        catch(InputMismatchException e)
        {
        System.out.println(" Invalid Input ");

        System.out.print("Enter the Number");
        n =Integer.parseInt(sc.next());
    }
        temp=n;
    while(n>0) {
        d = n % 10;
        rev=rev*10+d;
        n=n/10;

    }
    if(temp==rev)
    {
        System.out.println(temp+ " is the Palindrome Number");
    }
    }
}
