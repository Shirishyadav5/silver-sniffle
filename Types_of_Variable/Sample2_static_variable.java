package Types_of_Variable;

public class Sample2_static_variable
{
//    2: Example of static/class variable

    static  int num1=10;    //static global variable

    static void main() {

        //static global variable from same class
        System.out.println(num1);       //variable Name

        //static global variable call from diff class
        System.out.println(Sample3.num2);

    }

    public static void m1()
    {
        System.out.println(num1);       //variable name
    }

    public void m2()
    {
        System.out.println(num1);      //variable Name
        }
}
