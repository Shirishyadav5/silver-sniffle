package Logical.By_SanjaySir;

public class Ex13_String3_ReverseEachWordInStatement1
{
    static void main(String[] args) {

        String S1="My name is abc";
        String[] ar = S1.split(" ");

        for (int i=0; i<=ar.length-1; i++)
        {
            String org=ar[i];
            String rev="";
            for (int j=org.length()-1; j>=0; j--)
            {
                rev=rev+org.charAt(j);
            }
            System.out.print(rev+" ");
        }





    }
}
