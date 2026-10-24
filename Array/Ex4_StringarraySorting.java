package Array;

import java.util.Arrays;

public class Ex4_StringarraySorting
{
    static void main(String[] args) {

        String [] ar=new String[5];

        ar[0]="mahesh";
        ar[1]="ramesh";
        ar[2]="naresh";
        ar[3]="rajesh";
        ar[4]="ganesh";

        System.out.println(ar.length);
        System.out.println(ar[2]);

        System.out.println("---print all data----");
        for (String names:ar)
        {
            System.out.println(names);
        }

        Arrays.sort(ar);
        System.out.println("----print in Alphabetical");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
