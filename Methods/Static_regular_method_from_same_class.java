package Methods;

public class Static_regular_method_from_same_class
{
    static void main(String[] args) {

        System.out.println("main method started");

        m1();         //methodname();   to call static regular method from same class

        System.out.println("main method ended");
    }

    public static void m1()
    {
        System.out.println("Static regular method from same class");
    }
}
