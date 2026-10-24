package Constructor;

public class Sample6
{
//    User defined constructor with parameter
    int num7;
    int num8;

    Sample6(int c, int d)
    {
        num7=c;
        num8=d;
    }
    public void sub()
    {
        System.out.println(num7-num8);
    }

    public void div()
    {
        System.out.println(num7/num8);
    }
}
