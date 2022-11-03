package AakashD12.OopsAssignment.StudentC;

public class StudentConstructor
{
    String name;
    private int mark1, mark2, mark3;
    private int rollno;
    private int studtotalmarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudtotalmarks() {
        return studtotalmarks;
    }

    public void setStudtotalmarks(int studtotalmarks) {
        this.studtotalmarks = studtotalmarks;
    }


    public void calculateTotal(int mark1 , int mark2 , int mark3)
    {
        studtotalmarks = mark1 + mark2 + mark3;
        System.out.println("Total Marks in Three Subjects is : " + studtotalmarks);
    }

    public String displayStudDetails()
    {
        return "Student Name : " + name + "\n" +
                "Student Roll Num : " + rollno + "\n" +
                "Marks in Marathi : " + mark1 + "\n" +
                "Marks in English : " + mark2 + "\n" +
                "Marks in Hindi : " + mark3 + "\n" +
                "Total Marks : " + studtotalmarks;
    }

}