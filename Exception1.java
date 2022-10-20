package p2;
// Class B is subclass of A
class A
{
    void display()
    {
        System.out.println("Hii...");
    }
}
class B extends A
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
    }

}
