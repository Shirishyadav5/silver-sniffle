package Logical;

public class print_reverse_1stline_12345_2ndline_1234
{

    static void main() {

        for (int i=5; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
