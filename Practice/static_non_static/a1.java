package Practice.static_non_static;

public class a1
{

//    write a code using static method and output is square of 6 is 36
    public static void m1()
    {
        int num1=6;
        System.out.println(num1*num1);
    }

    static void main() {


        m1();   // method m1 call from same class
        a2.m2();    // method m2 call from diff class

    }
}
