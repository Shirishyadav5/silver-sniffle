package This_Super_keyword;

public class Test extends Test1
{
    int a=10;              // global variable from same class



    public void m1()
    {
        int a=2;            //local variable
        System.out.println(a);              //local variable from same class
        System.out.println(this.a);         //global variable from same class
        System.out.println(super.a);        //global variable from super class
    }

    static void main() {

//        To call method m1 from same class then we need to create object of same class
        Test t=new Test();          // classname objectname=new classname();
        t.m1();                     // objectname.methodname();

    }
}
