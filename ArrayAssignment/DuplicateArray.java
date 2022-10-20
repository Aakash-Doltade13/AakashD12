package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        int n,count=1;;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        n = Integer.parseInt(sc.next());
        int[] array = new int[5];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Element - : " + i + "--> ");
            array[i] = Integer.parseInt(sc.next());
        }
          Arrays.sort(array);
          
        for (int i = 0; i < array.length-1; i++) 
        { 
        	for (int j = i + 1 ; j <array.length; j++) 
        	{ 
        		
        		if (array[i]==(array[j]))
        		
        			count ++;
        			
        		else 
        			break;
        		
        	}
        	if(count >1)
        	{
        		System.out.println(array[i]+" --> "+count);
        		i+=(count-1);
        	}
       	 }
}}