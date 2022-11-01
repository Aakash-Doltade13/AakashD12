package OopsTasks;

import java.util.Scanner;

class Student
{
     String name;
     int mark1,mark2,mark3;
     int rollno;
     int totalmarks,stdtotalmarks;

    void setStudDetails()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Student Name");
        String name =sc.next();

        System.out.println("Enter Student ID");
        int rollno =sc.nextInt();

        System.out.println("Enter marks1");
        int mark1 =sc.nextInt();

        System.out.println("Enter marks2");
        int mark2 =sc.nextInt();

        System.out.println("Enter marks3");
        int mark3 =sc.nextInt();
    }
    int calculateTotal()
    {
    stdtotalmarks =  mark1 + mark2+ mark3;
    return  stdtotalmarks;

    }
    void displayStudDetails()
    {
        System.out.println("Student Name : " +name);
        System.out.println("Student Roll Num : " +rollno);
        System.out.println("Marks in Marathi : " +mark1);
        System.out.println("Marks in English : " +mark2);
        System.out.println("Marks in Hindi : " +mark3);
        System.out.println("Total Marks : " +stdtotalmarks);
    }
   public class StudentDemo
    {
        public static void main(String[] args)
        {
            Student std =new Student();

            std.setStudDetails();
            std.calculateTotal();
            std.displayStudDetails();

        }
    }

}