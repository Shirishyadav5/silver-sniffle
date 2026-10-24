package Practice;

public class Demo1
{
//    Example of static and non-static method

    static void main()
    {
        m1();
        System.out.println("---------------------------");

//        call non-static method call from same class
//        then we need to create object of same class
//        call-- objectname.methodname
        Demo1 d=new Demo1();
        d.m2();  //non-static method call from same class

        Demo2.m3();     // Static method call from diff class
        Demo2 d2=new Demo2();
        d2.m4();    //it is non-static method call from diff class

    }

    public static void m1()
    {
        System.out.println("Static m1 method from same class ");
    }

    public void m2()
    {
        System.out.println("Non-static m2 method from same class");
    }
}
