package Conditional_Statement.Else_if;

public class Test2
{
    static void main() {

        int shoppingAmt=28000;

        if (shoppingAmt>=50000)
        {
            System.out.println("you will get 20% Off");
        }
        else if (shoppingAmt>=20000 & shoppingAmt<50000)
        {
            System.out.println("you will get 10% off");
        }
        else if (shoppingAmt>=10000 & shoppingAmt<20000)
        {
            System.out.println("you will get 5% off");
        }
        else if (shoppingAmt>=5000 & shoppingAmt<10000)
        {
            System.out.println("you will get 3% off");
        }
        else if (shoppingAmt<5000)
        {
            System.out.println("no discount");
        }
    }
}
