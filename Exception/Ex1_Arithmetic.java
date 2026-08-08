package Exception;

public class Ex1_Arithmetic
{
    static void main(String[] args)
    {
        int num1=10;
        int num2=0;
        int div=0;

        try
        {
            div=num1/num2;
            System.out.println(div);
        }
        catch (Exception e)
        {
            System.out.println("exception is Handled");
        }

        System.out.println("Hi, hello");

    }
}
