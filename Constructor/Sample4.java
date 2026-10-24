package Constructor;

public class Sample4
{
//    1. Declare variable globally

    int num3;
    int num4;

    Sample4()                   //User defined constructor
    {
        num3=30;
        num4=40;
    }

    public void sub()
    {
        System.out.println(num3-num4);
    }

    public void div()
    {
        System.out.println(num3/num4);
    }
}
