package Logical.Practice2;

public class ReverseNumber
{
    static void main() {
        int num=54321;
        int rev=0;

        for (int i=num; i>0; i=i/10)
        {
           int rem= i%10;
           rev=rev*10+rem;

        }
        System.out.println(rev);
    }
}
