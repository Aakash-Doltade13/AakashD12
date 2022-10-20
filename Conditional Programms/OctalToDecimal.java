package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

//1258 = 1× 8.2 + 2 × 8.1 + 5 × 8.0

//= 1 × 64 + 2 × 8 + 5 × 1 = 64+16+5

//=85.10

public class OctalToDecimal
    {     
		public static void main(String[] args) 
		{
			int n,dec,p,res,d;
			Scanner sc = new Scanner(System.in);
			try
	        {
	        	
	         System.out.print("Input an octal number (using digit 0 - 7) : ");
	          n =Integer.parseInt(sc.next());
	          System.out.println("The Octal Number : " + n);
	        
	        }
	        catch(InputMismatchException | NumberFormatException e)
	        {
	        	System.out.println(" Invalid Input ");
	        	
	        	System.out.print("Input an octal number (using digit 0 - 7) : ");
	         n =Integer.parseInt(sc.next());
				System.out.println("The Octal Number : " + n);
	        }
			dec=0;
			 p=0;
			while(n!=0)
			{
				 d=n%10;
				dec=dec + d * power(8,p++);
				n=n/10;
			}
			System.out.println("The equivalent Decimal Number : "+dec);

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


