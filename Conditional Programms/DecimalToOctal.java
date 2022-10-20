package Assignment2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToOctal
{
//Divide 127 by 8
//127 ÷ 8= 15(Quotient) and 7Remain
//Divide 15 by 8 again
//15 ÷ 8 = 1(Quotient) and 7 Remain
//Divide 1 by 8
//1 ÷ 8 = 0(Quotient) and 1 Remain
//(127)10 = (177)8
	
	public static void main(String[] args)
		{
		int n,r;
		String bin;
			Scanner sc = new Scanner(System.in);
		 try
		    {
		       System.out.print("Input a Decimal Number to Convert In Octal Number : ");
		          n =Integer.parseInt(sc.next());
		    }
		     catch(InputMismatchException | NumberFormatException e)
		     {
		     System.out.println(" Invalid Input ");

				 System.out.print("Input a Decimal Number to Convert In Octal Number : ");
		         n =Integer.parseInt(sc.next());
		         
		      }
		 
	        bin="";
	        while(n!=0)
	        {
	        	 r=n%8;
	        	bin=r+bin;
	        	n=n/8;
	        }
	        System.out.println("The Octal Of" +" " + n +" " +"Is" +" " +bin);
		}

}
