package Generalization;

public class SavingAccount implements BankAccount
{

    public void CD()
    {
        System.out.println("CD: 1l");
    }

    public void CW()
    {
        System.out.println("CW: 50 Thousand");
    }

    public void MT()
    {
        System.out.println("MT: 5 Lac");
    }
}
