package ArrayAssignment;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        size = Integer.parseInt(sc.next());
        int [] element = new int[size];
        int sum=0;
        for(int i =0;i<size;i++)
        {
            System.out.print("element -"+i+"--> ");
            element[i] = Integer.parseInt(sc.next());
            sum+=element[i];
        }
        System.out.println("Sum of all elements stored in the array is :"+sum);
        }
}
