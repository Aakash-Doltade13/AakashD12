package NewAssign;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HcfOfTw
{
	public static void main(String[] args) {
			
	    	 int  a = 0,b = 0,gcd=0,i;
	         Scanner sc = new Scanner(System.in);
	         try
	         {
	             System.out.print("Enter 1st the Number");
	             a =Integer.parseInt(sc.next());
	             
	             System.out.print("Enter 2nd the Number");
	             b =Integer.parseInt(sc.next());

	         }
	         catch(InputMismatchException | NumberFormatException e)
	         {
	             System.out.println(" Invalid Input ");

	             System.out.print("Enter 1st the Number");
	             a =Integer.parseInt(sc.next());
	             
	             System.out.print("Enter 2nd the Number");
	             b =Integer.parseInt(sc.next());
	         }
	         for(i=1;i<=a;i++)
	         
	        	 if(a%i==0 && b%i==0)
	        	 {
	        		 gcd=i;
	        	 } 
		System.out.println("HCF = "+gcd);
		}
	}



