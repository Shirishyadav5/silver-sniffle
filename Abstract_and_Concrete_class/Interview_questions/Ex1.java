package Abstract_and_Concrete_class.Interview_questions;

abstract public class Ex1
{
//  Q3: is there constructor available in abstract class>
// Yes, abstract classes in Java can have constructors. However, you can't create an instance
// of an abstract class directly.
// Instead, the abstract class constructor is called when an instance of a sub class is created

    int num=10;
    Ex1()
    {

        System.out.println("constructor in abstract class");
    }

    void m1()
    {
        System.out.println("m1 method");
    }

}
