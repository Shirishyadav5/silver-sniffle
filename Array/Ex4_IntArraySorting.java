package Array;

import java.util.Arrays;

public class Ex4_IntArraySorting
{
    static void main(String[] args) {

        int [] ar=new int[4];

        ar[0]=104;
        ar[1]=103;
        ar[2]=101;
        ar[3]=102;

        System.out.println("print origional data");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);  //diffclassname.methodname(input)

        System.out.println("print Array in Ascending order");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("print Array in Descending Order");
        for (int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }
    }
}
