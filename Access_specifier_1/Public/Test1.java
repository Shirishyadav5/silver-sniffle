package Access_specifier_1.Public;

public class Test1
{
    public int num;

    public Test1()
    {
        num=40;
    }

    public void m2()
    {
        System.out.println(num*num);
    }

    static void main() {

        Test1 t1=new Test1();
        t1.m2();
        System.out.println(t1.num);
    }
}
