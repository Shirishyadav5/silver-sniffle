package Logical;

public class Ex8_StarPattern
{
    static void main(String[] args) {
//        print the following pattern
//        * * * * *
//        * *
//        * *
//        * *
//        * * * * *
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (i==1 || i==5 || j==1 || j==5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }





    }
}
