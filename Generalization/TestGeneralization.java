package Generalization;

public class TestGeneralization
{
    static void main(String[] args) {

        System.out.println("-----Saving Account");
        SavingAccount saving=new SavingAccount();
        saving.CD();
        saving.CW();
        saving.MT();

        System.out.println("-----Salary Account");
        SalaryAccount salary=new SalaryAccount();
        salary.CD();
        salary.CW();
        salary.MT();

        System.out.println("-----Current Account");
        CurrentAccount current=new CurrentAccount();
        current.CD();
        current.CW();
        current.MT();
    }
}
