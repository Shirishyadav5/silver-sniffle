package Array;

public class Sample1_multidimensional
{
    static void main(String[] args) {

        int [][]ar=new int[2][3];
        ar[0][0]=10;
        ar[0][1]=20;
        ar[0][2]=30;
        ar[1][0]=40;
        ar[1][1]=50;
        ar[1][2]=60;
        System.out.println(ar.length);
        System.out.println(ar[1][2]);

        System.out.println("Print all data with 2 dimensional array");
        for (int i=0; i<=1; i++)        //outer loop for -->Rows
        {
            for (int j=0; j<=2; j++)    //Inner loop for -->Columns
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}
