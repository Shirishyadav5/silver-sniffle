package Methods.Regular_Method;

public class Demo1
{
    static void main()
    {
        m1();  //methodname(); //static regular method from same class

        Demo1 D1=new Demo1();
        D1.m2();                //Non--static Regular method from SAme class

        Demo2.m4();             //Static Regular method from Different class

        Demo2 d=new Demo2();
        d.m3();                 //Non-static Regular method from different class

    }

    public static void m1()
    {
        System.out.println("Static Regular method from same class");
    }

    public void m2()
    {
        System.out.println("Non-static Regular method from same class");
    }
}
