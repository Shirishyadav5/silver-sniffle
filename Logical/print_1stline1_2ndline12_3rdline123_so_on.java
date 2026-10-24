package Logical;

public class print_1stline1_2ndline12_3rdline123_so_on
{
    static void main() {
//                    2<=5
        for (int i=1; i<=5; i++)
        {
//                        1<=2
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
