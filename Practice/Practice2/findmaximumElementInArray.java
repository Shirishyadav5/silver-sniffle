package Practice.Practice2;

import java.util.Arrays;

public class findmaximumElementInArray
{
    static void main(String[] args) {

        int [] ar={10,60,30,20};

        Arrays.sort(ar);
        System.out.println(ar[ar.length-1]);

        System.out.println();
    }
}
