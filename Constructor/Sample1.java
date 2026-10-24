package Constructor;

public class Sample1
{
//    Example of default constructor

//    default constructor--> Provided by compiler
//    use: to copy all the non-static members(method,variable) of class into object

//    Sample1()
//    {
//
//    }

    public void m1()
    {
        System.out.println("running method m1");
    }

    static void main(String[] args) {
        Sample1 s1=new Sample1();       // default constructor call from same class
        s1.m1();
//        Sample1 --> classname --> datatype /objecttype
//        s1   -->objectname--> use to identify/ refer object
//        new --> keyword -->create empty/ blank object
//        sample1()--> classname()-->constructor call

        System.out.println("-----------------------------");

        Sample2 s2=new Sample2();            //default constructor call from diff class
        s2.m2();






    }
}
