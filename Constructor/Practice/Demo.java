package Constructor.Practice;

public class Demo
{
    int num1;
    int num2;

    Demo(int a, int b)
    {
        num1=a;
        num2=b;
    }

    public void add()
    {
        System.out.println(num1+num2);
    }

    static void main() {

        Demo d=new Demo(10,10);
        d.add();
    }
}
