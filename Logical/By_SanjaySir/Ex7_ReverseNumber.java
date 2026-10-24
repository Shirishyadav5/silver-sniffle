package Logical.By_SanjaySir;

public class Ex7_ReverseNumber
{
    static void main(String[] args)
    {
        int orgnum=1234;
        int revnum=0;

        for (int i=orgnum; i>0; i=i/10)
        {
            int rem= i%10;
            revnum= revnum*10 + rem;
        }
        System.out.println(revnum);

    }
}
