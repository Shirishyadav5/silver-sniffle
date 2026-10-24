package Array;

import java.util.Arrays;

public class Ex8_FindSmallest_AND_HighestNumberinINTArray
{
    static void main(String[] args) {

        int [] ar={40,10,50,30,20};

        Arrays.sort(ar);
        System.out.println(ar[0]);
        System.out.println(ar[ar.length-1]);
    }
}
