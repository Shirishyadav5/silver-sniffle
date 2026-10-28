package Logical.By_SanjaySir;

import java.util.Arrays;

public class Ex17_Anagram
{
    static void main(String[] args) {

        String s1="race";
        String s2="care";

//        convert string to lower case
//        s1=s1.toLowerCase();
//        s2=s2.toLowerCase();

//      convert string to Array
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();

//        sort array
        Arrays.sort(ar1);  //a[0]b[1]c[2]d[3]
        Arrays.sort(ar2);  //a[0]b[1]c[2]d[3]

//        compare 2 Arrays
        if (Arrays.equals(ar1,ar2))
        {
            System.out.println("Given String are Anagram");
        }
        else
        {
            System.out.println("Given String are not Anagram");
        }

    }
}
