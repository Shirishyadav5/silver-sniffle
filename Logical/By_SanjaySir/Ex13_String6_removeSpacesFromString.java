package Logical.By_SanjaySir;

public class Ex13_String6_removeSpacesFromString
{
    static void main(String[] args)
    {

        String str1 = "a b   c d";
        System.out.println(str1);

        String str2 = str1.replace(" ", "");
        System.out.println(str2);


        String str3="";
        for (int i=0; i<=str1.length()-1; i++)
        {
            char s1 = str1.charAt(i);
            if (!Character.isWhitespace(s1))
            {
                str3=str3+s1;
            }
        }
        System.out.println(str3);





    }
}
