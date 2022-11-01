package OopsTasks;

public class StudentConstructor {
    String name;
    int mark1, mark2, mark3;
    int rollno;
    int totalmarks, stdtotalmarks;

     StudentConstructor(String name, int rollno, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
        int calculateTotal () {
            totalmarks = mark1 + mark2 + mark3;
            return totalmarks;
        }
        void displayStudDetails ()
        {
            System.out.println("Student Name : " + name);
            System.out.println("Student Roll Num : " + rollno);
            System.out.println("Marks in Marathi : " + mark1);
            System.out.println("Marks in English : " + mark2);
            System.out.println("Marks in Hindi : " + mark3);
            System.out.println("Total Marks : " + stdtotalmarks);
        }
    }

         class StudentDemo {
            public static void main(String[] args) {
                StudentConstructor std = new StudentConstructor("ll",69,70,70,70);
                std.calculateTotal();
                std.displayStudDetails();

            }
        }

