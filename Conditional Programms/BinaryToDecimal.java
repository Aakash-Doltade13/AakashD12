package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;


//(1101)2
//1 × 2^3 + 1 × 2^2 + 0 × 2^1 + 1 × 2^0
//= 8 + 4 + 0 + 1
//= 13


public class BinaryToDecimal 
{

	public static void main(String[] args)
	{
		int n,dec,p,d;
		Scanner sc = new Scanner(System.in);
		 try
	        {
	        	
	         System.out.print("The Binary Number : ");
	          n =Integer.parseInt(sc.next());
	        
	        }
	        catch(InputMismatchException | NumberFormatException e)
	        {
	        	System.out.println(" Invalid Input ");

				System.out.print("The Binary Number : ");
	         n =Integer.parseInt(sc.next());
	        }
		dec=0;
		 p=0;
		  while(n!=0)
		 {

		    d=n%10;
			dec=dec + d * power(2,p++);
			n=n/10;
		 }
		System.out.println("The equivalent Decimal Number is : " + dec );

	    }

	public static int power(int n,int p)
     {
	      int res=1;

	      for(int i=1;i<=p;i++)
	      {
	    	  res=res*n;
	      }
	      return res;
    }

}
