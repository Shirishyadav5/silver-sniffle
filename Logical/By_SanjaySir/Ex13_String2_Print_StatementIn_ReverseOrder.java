package Logical.By_SanjaySir;

public class Ex13_String2_Print_StatementIn_ReverseOrder
{
    static void main(String[] args) {

        String S1="My name is shirish";

        String [] ar=S1.split(" ");  //{my(0) name(1) is(2) abc(3)}

        for (int i=ar.length-1; i>=0; i--)
        {
            System.out.print(ar[i]+" ");
        }

    }
}
