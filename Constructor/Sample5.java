package Constructor;

public class Sample5
{
//    Example of user defined with parameter

    int num5;
    int num6;

    Sample5(int a, int b)
    {
        num5=a;
        num6=b;
    }

    public void add()
    {
        System.out.println(num5+num6);
    }
    public void multi()
    {
        System.out.println(num5*num6);
    }

    static void main() {

        Sample5 s5=new Sample5(2,4);
        s5.add();
        s5.multi();

        System.out.println("--------------");

        Sample6 s6=new Sample6(5,5);
        s6.sub();
        s6.div();
    }
}
