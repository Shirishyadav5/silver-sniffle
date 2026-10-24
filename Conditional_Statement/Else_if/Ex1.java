package Conditional_Statement.Else_if;

public class Ex1
{
    static void main()
    {

        int temprature=8;

        if (temprature>=55)
        {
            System.out.println("Its scorching hot outside!");
        }
        else if (temprature>=20)
        {
            System.out.println("The weather is warm and pleasant");
        }
        else if (temprature>=10)
        {
            System.out.println("It is bit chilly");
        }
        else
        {
            System.out.println("it is freezing cold");
        }
    }
}
