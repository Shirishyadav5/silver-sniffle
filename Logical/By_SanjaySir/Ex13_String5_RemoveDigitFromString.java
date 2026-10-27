package Logical.By_SanjaySir;

public class Ex13_String5_RemoveDigitFromString
{
    static void main(String[] args) {

        String str1="5abcd123xyz #";
        String str2="";

        for (int i=0; i<=str1.length()-1; i++)
        {
            char S1=str1.charAt(i);
            if (!Character.isDigit(S1))
            {
                str2=str2+S1;
            }
        }
        System.out.println(str2);
    }
}
