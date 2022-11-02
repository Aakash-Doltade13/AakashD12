package AakashD12.OopsAssignment;

import java.util.Scanner;

class Student
{
     String name;
     int subject1,subject2,subject3;
     int rollno;
     int totalmarks,stdtotalmarks;

    int calculateTotal()
    {
    stdtotalmarks =  subject1 + subject2+ subject3;
    return  stdtotalmarks;

    }
    void displayStudDetails()
    {
        System.out.println("Student Name : " +name);
        System.out.println("Student Roll Num : " +rollno);
        System.out.println("Marks in Marathi : " +subject1);
        System.out.println("Marks in English : " +subject2);
        System.out.println("Marks in Hindi : " +subject3);
        System.out.println("Total Marks : " +stdtotalmarks);
    }
   public class StudentDemo
    {
        public static void main(String[] args)
        {
            Student std =new Student();
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter Student Name");
            String name =sc.next();

            System.out.println("Enter Student ID");
            int rollno =sc.nextInt();

            System.out.println("Enter subjects1");
            int subject1 =sc.nextInt();

            System.out.println("Enter subjects2");
            int subject2 =sc.nextInt();

            System.out.println("Enter subjects3");
            int subject3 =sc.nextInt();

            std.calculateTotal();
            std.displayStudDetails();

        }
    }

}