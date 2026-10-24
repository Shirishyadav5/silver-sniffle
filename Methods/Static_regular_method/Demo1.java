package Methods.Static_regular_method;

public class Demo1
{
    static void main() {

        System.out.println("main method started");

        m1();
        m2();

        Demo1 s=new Demo1();
        s.m3();

        Demo2.m4();

        Demo2 d=new Demo2();
        d.m5();
    }

    public static void m1()
    {

        System.out.println("Static Regular method from same class");
    }

    public static void m2()
    {
        System.out.println("static regular method from same class");
    }

    public void m3()
    {
        System.out.println("non-static regular method from same class");
    }
}
