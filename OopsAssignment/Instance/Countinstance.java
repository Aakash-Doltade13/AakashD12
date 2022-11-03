package AakashD12.OopsAssignment.Instance;

public class Countinstance
{
    private static int  count;
        Countinstance()
        {
            count++;
        }
        public  int instanceCount()
        {
            return count;
        }

        public static void main(String[] args)
        {
            Countinstance i1 = new Countinstance();
            Countinstance i2 = new Countinstance();
            Countinstance i3 = new Countinstance();
            Countinstance i4 = new Countinstance();

            System.out.println("Number of instance of a class is : "+count);

        }
}
