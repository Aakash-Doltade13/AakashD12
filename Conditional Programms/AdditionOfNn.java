package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionOfNn
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, sum=0 ;
        try {
            System.out.println("Enter the term for Natural Numbers:");
            n=Integer.parseInt(sc.next());
            
            if(n<0)
                throw new IllegalArgumentException();

        } 
        catch (InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            System.out.println("Enter the term for Natural Numbers:");
            n=Integer.parseInt(sc.next());
            
        }
        System.out.println("The first "+ n +" natural number is :");
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(i +" ");
             
             sum += i;

        }
        System.out.print("\n");
        System.out.println("The Sum of Natural Number upto " +n +" terms :" +sum);
    }
}
