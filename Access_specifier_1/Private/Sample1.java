package Access_specifier_1.Private;

public class Sample1
{             //if you declare any member of class as private then
            // scope of that member remaince only within the class
            // It can't be accessed from other class


    private int num;

    private Sample1()
    {
        num=10;
    }

    private void m1()
    {
        System.out.println(num*num);
    }

    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();
        s1.m1();

    }
}
