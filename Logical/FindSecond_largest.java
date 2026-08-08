package Logical;

import java.util.Arrays;

public class FindSecond_largest
{
    static void main(String[] args) {

        int [] ar={90,40,30,20,80};

        Arrays.sort(ar);
        System.out.println(ar[ar.length-1]);

        System.out.println(ar[ar.length-2]);

        System.out.println(ar.length);

        for (int result:ar)
        {
            System.out.print(result+" ");
        }
    }
}
