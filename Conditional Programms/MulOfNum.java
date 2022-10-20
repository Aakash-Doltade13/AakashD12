package Assignment4;

import java.util.Scanner;

public class MulOfNum
{
    public static void main(String[] args) 
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Input the number (Table to be calculated) :");
            n=Integer.parseInt(sc.next());
            if(n<0)
            {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.println("Input the number (Table to be calculated) :");
                n=Integer.parseInt(sc.next());
            }
        } 
        catch (Exception e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.println("Input the number (Table to be calculated) :");
            n=Integer.parseInt(sc.next());
        }
        for(i=1;i<=10;i++)
            System.out.println(n+" X "+i+" = " +n*i);
    }
}

