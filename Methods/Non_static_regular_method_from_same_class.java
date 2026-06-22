package Methods;

public class Non_static_regular_method_from_same_class
{
    static void main(String[] args) {

        System.out.println("main method started");

//        Non-static regular method call from same class -->for that we need to create object of same class

//        classname objeictname=new classname();
//
        Non_static_regular_method_from_same_class s1=new Non_static_regular_method_from_same_class();
        s1.m1();             //objectname.methodname

        System.out.println("main method ended");
    }

    public void m1()
    {
        System.out.println("Non static regular method from same class");
    }
}
