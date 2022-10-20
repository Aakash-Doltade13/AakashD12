package Assignment2;
import java.lang.String;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class ReverseString
{
    public static void main(String[] args)
    {
    	String s;
    	Scanner sc=new Scanner(System.in);
    	try {
    	System.out.println("Enter Name Here");
    	 s=sc.next() ;
    	}
    	catch(InputMismatchException | NumberFormatException e)
    	{
    		System.out.println("Enter Valid Name ");
    		
    		System.out.println("Enter Name Here");
       	  s=sc.next() ;
    		
    	}
    	s = s.trim();
        String rev = "";
        
        for (int i = s.length() - 1; i >= 0; i--)
        {

				rev = rev + s.charAt(i);

        }
        
        System.out.print(rev);
    }
}