package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

//any series
//use for loop 1st starting num last add diff with updation
//within loop add incrementation with sum



public class ApSeries
{
	 public static void main(String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
	  int a,i,d=0, n,sum=0;
	 
	  try 
	  {
	  System.out.print("Input the Starting number of the A.P. series: ");
	  a = Integer.parseInt(sc.next());

	  System.out.print("Input the number for the A.P. series: ");
	  n = Integer.parseInt(sc.next());

	  System.out.print("Input the common difference of A.P. series: ");
	  d = Integer.parseInt(sc.next());
	  }
       catch(InputMismatchException | NumberFormatException e)
        {
    	   System.out.println(" Invalid Input ");
    	   
    	   System.out.print("Input the Starting number of the A.P. series: ");
    		  a = Integer.parseInt(sc.next());

    		  System.out.print("Input the number for the A.P. series: ");
    		  n = Integer.parseInt(sc.next());

    		  System.out.print("Input the common difference of A.P. series: ");
    		  d = Integer.parseInt(sc.next());
        }	  
	  for ( i = 1,a=1; i <=n ; i++,a+=4) 
	  {
		  sum=sum+a;
		  System.out.print(a +"+");
	  }
	  System.out.print("\n");
	  System.out.print("The Sum Of The A.P Series Are = " +sum);
	 }     
}
