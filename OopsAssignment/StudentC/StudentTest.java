package AakashD12.OopsAssignment.StudentC;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args)
        {
            String name;
            int mark1 , mark2, mark3,studtotalmarks = 0;
            int rollno;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Details below :- ");
            System.out.println("Enter Student Name");
            name =sc.next();

            System.out.println("Enter Student ID");
            rollno =sc.nextInt();

            System.out.println("Enter Marks in Marathi");
            mark1 = sc.nextInt();
            if (mark1 >100)
            {
                System.out.println("Enter valid Marks ");
                mark1 = sc.nextInt();
            }
            System.out.println("Enter Marks in Hindi");
            mark2 = sc.nextInt();
            if (mark2 >100)
            {
                System.out.println("Enter valid Marks ");
                mark2 = sc.nextInt();
            }

            System.out.println("Enter Marks in English");
            mark3 = sc.nextInt();
            if (mark3 >100)
            {
                System.out.println("Enter valid Marks ");
                mark3 = sc.nextInt();
            }
            StudentConstructor std = new StudentConstructor();

            std.setName(name);
            std.setRollno(rollno);
            std.setMark1(mark1);
            std.setMark2(mark2);
            std.setMark3(mark3);
            std.calculateTotal(std.getMark1() , std.getMark2() , std.getMark3());
            System.out.println(std.displayStudDetails());

        }
}
