package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

class ArmstrongN
{
    public static void main(String[] args)

    {

        int arm=0,n,temp,rem;
        Scanner sc =new Scanner(System.in);
        try
        {
        	
         System.out.print("Input an Integer : ");
          n =Integer.parseInt(sc.next());
        
        }
        catch(InputMismatchException | NumberFormatException e)
        {
            System.out.println(" Invalid Input ");

            System.out.print("Input an Integer : ");
            n =Integer.parseInt(sc.next());
        }
        
        temp =n;
        while(n>0)
        {
            rem=n% 10;
            arm =(rem*rem*rem*rem)+arm;
            n = n /10;
        }
        if (temp==arm)
        {
            System.out.print(temp + "  Is an Armstrong Number");
        }
        else
        {
            System.out.print(temp + "  Is Not an Armstrong Number");
        }
    }
}
