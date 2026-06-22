package Constructor;

public class Sample3
{
//    Example of user defined constructor

//    1: declaration of variable
    int num1;
    int num2;

//    user defined constructor--> provided by the programmer/user
//    use1: initialize global variable
//    use2: to copy all the non-static members(methods, variables) of class into object

    Sample3()
    {
        num1=10;
        num2=20;
    }

    public void add()
    {
        System.out.println(num1+num2);
    }

    public void multi()
    {
        System.out.println(num1*num2);
    }

    static void main(String[] args) {

        Sample3 s3=new Sample3();             //user defined constructor call from same class
        s3.add();
        s3.multi();

        System.out.println("------------------");

        Sample4 s4=new Sample4();       //User defined constructor call from diff class
        s4.sub();
        s4.div();
    }
}
