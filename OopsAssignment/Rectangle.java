package AakashD12.OopsAssignment;

public class Rectangle
{
    int length,breadth,l,b;

    void area()
    {
        int Area =length*breadth;
    }
    Rectangle(int length,int breadth)
    {
        length=l;
        breadth=b;
    }

    public static void main(String[] args) {
        Rectangle rc =new Rectangle(5,6);

        rc.area();
    }
}
