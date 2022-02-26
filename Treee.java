package programs;

class A
{
    final int a = 15;
}
class B extends A
{
    final int a = 20;
}
public class Treee extends B
{
    final int a = 30;

    public static void main(String args[])
    {
        Treee m = new B();
        System.out.print(m.a);
    }
}
