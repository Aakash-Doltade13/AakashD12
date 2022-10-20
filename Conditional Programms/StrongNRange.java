package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StrongNRange {
	public static void main(String[] args) {
		int n,nth,i,j,r,sum,temp;
	Scanner sc = new Scanner(System.in);
	try {
     System.out.print("Enter Starting Number here");
     n =  Integer.parseInt(sc.next());
     System.out.print("Enter  nth Number here");
     nth =  Integer.parseInt(sc.next());
	} catch(InputMismatchException | NumberFormatException e)
	{
		System.out.println(" Invalid Input ");
        System.out.println("Please Enter valid input Again");
		 System.out.print("Enter Starting Number here");
	     n =  Integer.parseInt(sc.next());
	     System.out.print("Enter  nth Number here");
	     nth =  Integer.parseInt(sc.next());
	}for ( i=n ; i <=nth; i++) {
		sum=0;
		temp=i;
		while (temp > 0) {
          r = temp % 10;
          int fact = 1;
          for ( j = 1; j <= r; j++){
              fact = fact * j;}
          sum = sum + fact;
          temp = temp / 10;}
		if (sum==i) {
         System.out.print( + i +" ");}
     }}}