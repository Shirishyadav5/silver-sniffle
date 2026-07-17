package Abstract_and_Concrete_class.Interview_questions;

public class Test2 extends Test1
{

    public void m2()
    {
        System.out.println("method m2 in test2");
    }



    static void main(String[] args) {

        Test2 t=new Test2();
        t.m1();
        t.m2();

    }
}
