package Methods;

public class with_parameter
{
    static void main(String[] args) {

        addition(10,20);
        addition(20,40);
        addition(30,50);

        System.out.println("---------------");

        with_parameter p1=new with_parameter();
        p1.multiplication(5,8);
        p1.multiplication(10,20);

    }

    public static void addition(int num1, int num2)
    {
        int sum=num1+num2;
        System.out.println(sum);
    }

    public void multiplication(int num1, int num2)
    {
        int multi=num1*num2;
        System.out.println(multi);
    }
}
