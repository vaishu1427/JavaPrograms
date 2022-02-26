package programs;

class A
{
    final int a = 15;
}
class B extends A
{
    final int a = 20;
}
public class final2 extends B
{
    final int a = 30;

    public static void main(String args[])
    {
        B b = new final2();
        System.out.print(b.a);
    }
}

