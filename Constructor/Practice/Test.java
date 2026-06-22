package Constructor.Practice;

public class Test
//    with parameter
{
    int no1;
    int no2;
    int no3;//variable declaration

    Test(int a, int b)
    {
        no1=a;
        no2=b;
    }
    Test(int c)
    {
        no3=c;
    }

    public void div()
    {
        System.out.println(no1/no2);
    }

    public void square()
    {
        System.out.println(no3*no3);
    }
    static void main() {

        Test t=new Test(10,10);
        t.div();

        Test1 t1=new Test1(20,10);
        t1.add();

        Test t3=new Test(3);
        t3.square();

    }


}
