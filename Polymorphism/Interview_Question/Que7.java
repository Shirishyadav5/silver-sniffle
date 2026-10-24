package Polymorphism.Interview_Question;

public class Que7
{
//    what is method hiding

    public static void show()
    {
        System.out.println("static method in parent");
    }
}
//Method hiding in Java occurs when a subclass defines a static method
// with the exact same signature (name and parameters) as a static method in its superclass.