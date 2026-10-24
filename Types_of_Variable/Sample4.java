package Types_of_Variable;

public class Sample4
{
    int num1=30;

    public static void m1()
    {
//
        Sample4 s1=new Sample4();
        System.out.println(s1.num1);

        Sample5 s4=new Sample5();
        System.out.println(s4.num2);

    }

    public void m2()
    {
        System.out.println(num1);
        Sample5 s4=new Sample5();
        System.out.println(s4.num2);


    }

    static void main() {

        //call non-static variable from same class

        //create object of same class
        Sample4 s2=new Sample4();   //classname objectname=new classname();
        System.out.println(s2.num1);      //objectname.non-static global variable

        //call non-static variable from diff class
        //create object of diff class
        Sample5 s3=new Sample5();
        System.out.println(s3.num2);   //objectname.variablename
    }
}
