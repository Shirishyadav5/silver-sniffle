package Conditional_Statement.Else_if;

public class Test
{

    static void main()
    {

        int marks=34;

        if (marks>=65)       //Condition1
        {
            System.out.println("Pass with Distinction");
        }

        else if (marks>=60 & marks<65)     //condition2
        {
            System.out.println("Pass with First Class");
        }
        else if (marks>=50 & marks<60)//condition3
        {
            System.out.println("Pass with Second Class");
        }
        else if (marks>=35 & marks<50)//condition4
        {
            System.out.println("Pass");//condition5
        } else if (marks<=35)
        {
            System.out.println("Fail");
        }


    }
}
