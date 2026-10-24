package Conditional_Statement.Nested_if;

public class Ex3
{
    static void main() {

        int age=18;

        if (age>=18)
        {
            System.out.println("You are eligible to vote");

            boolean vote=true;
            if (vote==true)
            {
                System.out.println("vote for loksabha");
            }
            else
            {
                System.out.println("denied for loksabha");
            }
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}
