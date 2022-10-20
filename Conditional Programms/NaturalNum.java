package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NaturalNum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nth;
        try {
            System.out.println("Enter the term for  Natural Numbers:");
            nth=Integer.parseInt(sc.next());
            if(nth<0)
                throw new IllegalArgumentException();

        } 
        catch (InputMismatchException | IllegalArgumentException e)
        {
            System.out.println("Invalid Input..Please Enter Valid Input");
            
            System.out.println("Enter the term for Natural Numbers:");
            nth=Integer.parseInt(sc.next());
            
        }
        for(int i=1;i<=nth;i++)
        {
            System.out.print(+i +" ");
        }
    }
}
