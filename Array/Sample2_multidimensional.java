package Array;

public class Sample2_multidimensional
{
    static void main(String[] args) {

        int [][]ar={{10,20,30},{40,50,60}};

        System.out.println(ar[1][2]);

        System.out.println("print data for multidimensional/2 dimensional");

        for (int i=0; i<=1; i++)
        {
            for (int j=0; j<=2; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("print in reverse order array");
        for (int i=1; i>=0; i--)
        {
            for (int j=2; j>=0; j--)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
