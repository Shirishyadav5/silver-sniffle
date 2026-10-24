package Logical;

public class Ex5_StarPattern
{
    static void main(String[] args) {

//       print the following pattern
//           *
//          * *
//         * * *
//        * * * *
//       * * * * *

        for (int i=1; i<=5; i++)
        {
            for (int j=5; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
