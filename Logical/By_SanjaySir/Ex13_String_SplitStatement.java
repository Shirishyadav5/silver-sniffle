package Logical.By_SanjaySir;

public class Ex13_String_SplitStatement
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
