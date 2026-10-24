package Access_specifier_1.Default;

public class Test1
{
    int num;

    Test1()
    {
        num=20;
    }

    void m2()
    {
        System.out.println(num*num);
    }

    static void main(String[] args)
    {
        Test1 t1=new Test1();
        t1.m2();
        System.out.println(t1.num);

    }
}
// if you declare any member of class as default then scope of that member remains only within the package.
// it can't be access from other packages.
// there is no keyword to represent the default access specifier.