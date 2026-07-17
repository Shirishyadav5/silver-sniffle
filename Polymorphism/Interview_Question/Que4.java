package Polymorphism.Interview_Question;

public class Que4 extends Que3
        //Can we inherit static methods in inheritance?
        // Yes, static methods are inherited in Java
{
    public static void m2()
    {
        System.out.println("method m2");
    }

    static void main(String[] args)
    {

     Que4.m1();
     Que4.m2();


    }
}
