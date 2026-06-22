package Constructor.Practice;

public class Sample1
{
//    user defined constructor without parameter

    int num1;
    int num2;

    Sample1()
    {
        num1=10;
        num2=20;
    }

    public void sub()
    {
        System.out.println(num1-num2);
    }
    public void mult()
    {
        System.out.println(num1*num2);
    }


    static void main()
    {
        Sample1 s1=new Sample1();
        s1.sub();
        s1.mult();

        Sample2 s2=new Sample2();
        s2.add();

    }
}
