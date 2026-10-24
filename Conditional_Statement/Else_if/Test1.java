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
// write a code for students marks
//if student marks is above 65 then it is distiction class
//if marks is between 60 to 65 then it is first class
//if marks is between 50 to 60 it is second class
//if marks is betn 35 to 50 it is pass class
//and marks is less than 35 it is fails--->write code for seperate the student class
