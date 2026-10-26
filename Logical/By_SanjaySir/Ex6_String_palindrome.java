package Logical.By_SanjaySir;

public class Ex6_String_palindrome
{
    static void main(String[] args) {

        String str="madam";
        String rev="";

        for (int i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        if (str.equals(rev))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Given String is Not Palindrome");
        }
    }

    public static class Ex13_String_SplitStatement
    {
        static void main(String[] args) {

            String S1="my name is shirish";

            String [] ar = S1.split(" ");

            System.out.println(ar[3]);
            System.out.println("---------");

            for (int i=0; i<=ar.length-1; i++)
            {
                System.out.println(ar[i]);
            }

        }
    }
}
