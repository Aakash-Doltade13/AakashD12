package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToHexadecimal 
{
	//convert Decimal to Hexadecimal
	//1. DECIMAL--> BASE 10-->0,1,2,3,4,5,6,7,8,9
	//2. BINARY-->BASE 2--> 0,1
	//3. OCTAL-->BASE 8-->0,1,2,3,4,5,6,7
	//4. HEXADECIMAL-->BASE 16-->0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
	//divided by 16 and then take remainder as hex value
	

	
		public static void main(String[] args)
		{
			int n,r;
			String hex;
			Scanner sc = new Scanner(System.in);
			 try
		        {
		        	
		         System.out.print("Input Decimal Number to Convert in  Hexadecimal Number :");
		          n =Integer.parseInt(sc.next());
		        
		        }
		        catch(InputMismatchException | NumberFormatException e)
		        {
		        	System.out.println(" Invalid Input ");
		        	
		        	System.out.print("Enter the Number");
		         n =Integer.parseInt(sc.next());
		        }
	         hex="";
	        while(n!=0)
	        {
	        	 r=n%16;
	        	if(r==10)
	        	{
	        		hex="a"+hex;
	        	}
	        	else if(r==11)
	        	{
	        		hex="b"+hex;
	        	}
	        	else if(r==12)
	        	{
	        		hex="c"+hex;
	        	}
	        	else if(r==13)
	        	{
	        		hex="d"+hex;
	        	}
	        	else if(r==14)
	        	{
	        		hex="e"+hex;
	        	}
	        	else if(r==15)
	        	{
	        		hex="f"+hex;
	        	}
	        	else
	            {
	        		hex=r+hex;
	            }
	        	n=n/16;
	       }
	        System.out.println("The Equivalent Hexadecimal Number : "+ hex);
		}
}
