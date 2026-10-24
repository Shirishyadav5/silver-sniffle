package Methods;

public class Non_static_regular_method_from_different_class
{
    static void main()
    {
        System.out.println("main method started");
        //create object of diff/another class/or copy of class /instance of class
        //classname objectname=new classname();

//        1. classname -- it is a orgional class
//        2. objectname-- provide name of object- store info
//        3. new        -- new is a keyword -used for object creation
//        4  classname(); -- this is copy of class/instance of class--"constructor"
        Demo1 s2=new Demo1();   // call from demo1 class-non-static regular method
        s2.m2();
        System.out.println("main method ended");
    }
}
