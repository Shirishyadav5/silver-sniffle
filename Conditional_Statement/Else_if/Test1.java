package Conditional_Statement.Else_if;

public class Test1
{
    static void main()
    {

        int marks=29;

        if (marks>=65)
        {
            System.out.println("Distinction");
        }
        else if (marks>=60 & marks<65)
        {
            System.out.println("First class");
        }

        else if (marks>=50 & marks<60)
        {
            System.out.println("Second class");
        }
        else if (marks>=35 & marks<50)
        {

            System.out.println("Pass");
        }

        else
        {
            System.out.println("Fail");
        }

    }
}
