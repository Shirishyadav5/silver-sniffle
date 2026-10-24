package Polymorphism;

public class method_overriding
{
    static void main() {

        Demo1 d1=new Demo1();
        d1.car();
        d1.Home();
        d1.Money();

        System.out.println("-------------------------");

        Demo2 d=new Demo2();
        d.mobile();
        d.car();
        d.Money();
        d.Home();
    }
}
