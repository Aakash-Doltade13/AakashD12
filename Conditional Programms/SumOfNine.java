package NewAssign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNine
{
    public static void main(String[] args) 
    {
        int a,sum=0;
        System.out.println("Numbers between 100 and 200, divisible by 9 :");
        
        for (int i=100;i<=200;i++)
        {
            if(i%9==0)
            {
                System.out.print(i +" ");
                sum=sum+i;

            }
          } 
        System.out.print("\n");
        System.out.println("The sum : "+sum);
    }
}
