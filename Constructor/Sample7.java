package Constructor;

public class Sample7
{
//    Example of multiple constructor in same class -->Constructor Overloading

//    Constructor Overloading

    int num1;
    int num2;

//    user defined without parameter
    Sample7()
    {
        num1=10;
        num2=20;
    }
//    user defined constructor with 2 int parameter
    Sample7(int a, int b)
    {
        num1=a;
        num2=b;
    }
//  constructor with 1 int parameter
    Sample7(int a)
    {
        num1=a;
    }

    public void add()
    {
        System.out.println(num1+num2);
    }
    public void div()
    {
        System.out.println(num1/num2);
    }
    public void square()
    {
        System.out.println(num1*num1);
    }

    static void main() {
        Sample7 s7=new Sample7();
        s7.add();
        s7.div();

        Sample7 s8=new Sample7(2,2);
        s8.div();
        s8.add();

        Sample7 s9=new Sample7(3);
        s9.square();

        Sample8 s3=new Sample8();
        s3.m1();
    }
}
