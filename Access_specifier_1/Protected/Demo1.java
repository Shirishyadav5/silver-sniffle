package Access_specifier_1.Protected;

public class Demo1
{
    protected int num;

    protected Demo1()
    {
        num=20;
    }

    protected void m1()
    {
        System.out.println(num*num);
    }

    static void main() {

        Demo1 d1=new Demo1();
        d1.m1();
        System.out.println(d1.num);
    }
}
