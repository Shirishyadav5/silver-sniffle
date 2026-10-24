package Conditional_Statement.Nested_if;

public class Ex2
{
    static void main() {

        String UN="abc1";
        String pwd="xyz";

        if (UN=="abc")
        {
            System.out.println("Correct Username entered");

            if (pwd=="xyz")
            {
                System.out.println("Correct PWd entered");
            }
            else
            {
                System.out.println("wrong pwd entered");
            }
        }
        else
        {
            System.out.println("wrong username entered");
        }
    }
}
