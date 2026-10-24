package Conditional_Statement.Nested_if;

public class Ex1
{
    static void main() {

        int  Primarks=350;

        if (Primarks>=300)
        {
            System.out.println("selected in prilim Exam");
            System.out.println("prepairing for mains exam");

            int mainmarks=800;
            if (mainmarks>=800)
            {
                System.out.println("selected in main exam");
            }
            else
            {
                System.out.println("Rejected for main exam");
            }
        }
        else
        {
            System.out.println("Rejected from prelim exam");
        }
    }
}


//if