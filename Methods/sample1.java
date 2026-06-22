package Methods;

public class sample1
{
    static void main(String[] args)
    {
        System.out.println("Main method Started");

        m1();

        sample1 s1=new sample1();
        s1.m2();





    }

    public static void m1()
    {
        System.out.println("static Regular method from same class");
    }

    public void m2()
    {
        System.out.println("Non-static regular method from same class");
    }
}
