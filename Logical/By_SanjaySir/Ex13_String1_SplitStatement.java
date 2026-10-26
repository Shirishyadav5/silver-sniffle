package Logical.By_SanjaySir;

public class Ex13_String1_SplitStatement
{
    static void main(String[] args) {

        String S1="My name is abc";

        String[] ar = S1.split(" ");

        System.out.println(ar[3]);

        System.out.println("---------");

        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
