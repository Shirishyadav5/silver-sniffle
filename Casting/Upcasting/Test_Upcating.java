package Casting.Upcasting;

public class Test_Upcating
{

    static void main(String[] args) {

        son s=new son();
        s.mobile();
        s.car();
        s.money();
        s.home();

//        Create object of subclass with reference/datatype of superclass

        Father f=new son();    //->syntax of object creation
        f.car();
        f.home();
        f.money();
    }
}
