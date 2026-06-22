package Types_of_Variable;

public class Sample6
{
    int num1=10;

    public static void m1()
    {
//        Non-static variable call in static method--
//        then we need to create object of same class
//        and -- call them objectname.variablename
        Sample6 s6=new Sample6();
        System.out.println(s6.num1);
    }

    public void m2()
    {
//        Non-static variable call in non-static method--
//        we call non-static variable directly in non-static method
//
//        But we can call non-static variable from diff class--
//        then we need to create object of diff class

        System.out.println(num1);
    }

}
