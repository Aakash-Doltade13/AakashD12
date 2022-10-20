package Assignment4;

import java.util.Scanner;

public class NumPatternForSame
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        try {
            System.out.println("Enter The Number Of Terms:");
            n=Integer.parseInt(sc.next());
            if(n<0) {
                System.out.println("Invalid Input..Please Enter Valid Input");
                System.out.println("Enter The Number Of Terms: ");
                n=Integer.parseInt(sc.next());
            }
        } catch (Exception e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.println("Enter The Number Of Terms: ");
            n=Integer.parseInt(sc.next());
        }
        for (i=1;i<=n;i++)
        {
            
            for ( j=1;j<=i;j++)
            {
               System.out.print(i +" ");
               
            }
            System.out.println();
        }


    }
}
