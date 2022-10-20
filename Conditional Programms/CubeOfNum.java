package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CubeOfNum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0,temp=0;
        try {
            System.out.println("Input the Number Of Terms : ");
            n=Integer.parseInt(sc.next());
            
            if(n<0)
            {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.println("Input the Number Of Terms : ");
                n=Integer.parseInt(sc.next());
            }
        } 
        catch (Exception e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.println("Input the Number Of Terms : ");
            n=Integer.parseInt(sc.next());
        }
        for (int i=1;i<=n;i++)
        {
            temp=i*i*i;
            System.out.println("Number is : " +i +" and cube of the " +i +" is :" +temp);
        }
    }
}