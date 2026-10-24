package Methods.method_with_parameter;

public class Test
{
    static void main()
    {
        addition(10,30);
        subtraction(3,30);
        multiplication(20,20);
        division(20,20);

//        Non-static regular method with parameter
        Test t=new Test();
        t.add(20,20);


    }

    public static void addition(int num1, int num2)
    {
        int sum=num1+num2;
        System.out.println(sum);
    }
    public static void subtraction(int num1, int num2)
    {
        int sub=num1-num2;
        System.out.println(sub);
    }

    public static void multiplication(int num1, int num2)
    {
        int multi=num1*num2;
        System.out.println(multi);
    }
    public static void division(int num1, int num2)
    {
        int div=num1/num2;
        System.out.println(div);

    }

    public void add(int num1, int num2)
    {
        int result=num1+num2;
        System.out.println(result);
    }
}
