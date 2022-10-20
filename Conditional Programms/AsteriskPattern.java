package Assignment4;

import java.util.Scanner;

public class AsteriskPattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        try {
            System.out.println("Enter The Number Of Terms:");
            n=Integer.parseInt(sc.next());
            if(n<0) {
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
        int a=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
               System.out.print(a +" ");
                
            }
            System.out.println();
        }
    }
}
