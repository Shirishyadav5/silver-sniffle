package Polymorphism.Interview_Question;

public class Que8 extends Que7
{  // This hides the static method of the Parent class
    public static void show()
    {
        System.out.println("static method in child");
    }
}
