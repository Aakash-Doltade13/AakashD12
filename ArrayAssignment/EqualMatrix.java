package Arrays2Assign;

import java.util.Scanner;

public class EqualMatrix 
{ public static void main(String[] args)
{

    int i,j,a,b,x,y,flag = 1;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input the number of rows & columns in the 1st matrix : ");
    a = Integer.parseInt(sc.next());
    
    b = Integer.parseInt(sc.next());
  
    System.out.print("Input the number of rows & columns in the 2nd matrix : ");
    x = Integer.parseInt(sc.next());
    
    y = Integer.parseInt(sc.next()); 


    int[][] array1 = new int[4][4];
    int[][] array2 = new int[4][4];
   
    System.out.println("Input elements in the First matrix : ");
    for(i= 0; i < a; i++)
    {
        for( j = 0; j < b; j++)
        {
            System.out.print("element - [" + i + "],[" + j + "] : ");
            array1[i][j] = sc.nextInt();
        }
    }
    System.out.println("Input elements in the Second matrix : ");
    for(i= 0; i < x; i++)
    {
        for( j = 0; j < y; j++)
        {
            System.out.print("element - [" + i + "],[" + j + "] : ");
            array2[i][j] = sc.nextInt();
        }
    }
    System.out.println("\nThe First matrix is : ");
    for(i = 0; i < a; i++) {
    	 System.out.println();
        for( j = 0; j < b; j++) {
            System.out.print(array1[i][j] + "  ");
        }
    }
    System.out.println("\nThe Second matrix is : ");
    for(i = 0; i < x; i++) {
        System.out.println();
        for( j = 0; j < y; j++) {
            System.out.print(array2[i][j] + "  ");
        }
    }
    if(a != x && b != y)
       {  
    	System.out.print("The Matrices Cannot be compared :\n");
       }
      else
       {
    	  System.out.print("The Matrices can be compared : \n");
       }
    	 
		for(i=0; i<a; i++)
     	{
      		for(j=0; j<y; j++)
      		{
 			if(array1[i][j] != array2[i][j])
 			{
 	   			flag = 0;
 	   			break;
 			}
      		}
    	 }
     if(flag == 1 ) {
    	 System.out.print("Two matrices are equal\n ");}
     else {
    	 System.out.print("But,two matrices are not equal");}
       }
     	
 }



