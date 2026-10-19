package Types_of_Variable;

public class Demo1
{
    int b=20;       //Global variable
    static int c=30; //static variable
    static void main(String[] args)
    {
        m1();
        Demo1 d=new Demo1();
        d.m2();
        System.out.println(d.b);

    }

    public static void m1()
    {
        int a=10;       //Local variable
        System.out.println(a);
    }

    public void m2()
    {
        System.out.println(c);
    }


}
