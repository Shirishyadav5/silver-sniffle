package Casting.Upcasting;

public class son extends Father
{

    public void mobile()
    {
        System.out.println("mobile: Samsung");
    }

    public void car()           //method Override
    {
        System.out.println("car: BMW");
    }

    public void money()
    {
        System.out.println("money: 0.5 lac");
    }
}
