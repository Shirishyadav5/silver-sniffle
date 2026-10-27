package Logical.By_SanjaySir;

public class Ex13_String10_SeperateNumbersFromString2
{
    static void main(String[] args) {

        String str1="ab12cd4xyz";
        String str2="";

        for (int i=0; i<=str1.length()-1; i++)
        {
            char charvalue = str1.charAt(i);
            if (Character.isDigit(charvalue))
            {
                str2=str2+charvalue;
            }
        }
        System.out.println(str2);
        int n1 = Integer.parseInt(str2);
        System.out.println(n1+5);
    }
}
