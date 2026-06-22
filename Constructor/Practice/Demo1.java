package Constructor.Practice;

public class Demo1
{
//    constructor overloading
    int num1;
    int num2;

    Demo1()
    {
        num1=10;
        num2=30;        //user defined without para
    }
    Demo1(int a, int b)
    {
        num1=a;
        num2=b;             //with parameter
    }

    Demo1(int c)
    {


        num1=c;
    }
    public void add()
    {
        System.out.println(num1+num2);
    }
    public void square()
    {
        System.out.println(num1*num1);
    }

    static void main() {

        Demo1 d=new Demo1();
        d.add();

        Demo1 d1=new Demo1(10,10);
        d1.add();

        Demo1 d2=new Demo1(20);
        d2.square();

        Demo2 d3=new Demo2(50,60);
        d3.multi();
    }
}
