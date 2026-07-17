package Generalization;

public class CurrentAccount implements BankAccount
{
    public void CD()
    {
        System.out.println("CD: 5 lac");
    }

    public void CW()
    {
        System.out.println("CW: 2 lac");
    }

    public void MT()
    {
        System.out.println("MT: 2 lac");
    }
}
