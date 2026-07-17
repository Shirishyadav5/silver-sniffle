package Logical.By_SanjaySir;

public class Ex2_To_find_Factorial_number
{
//    To find the factorial of the given number

    static void main(String[] args)
    {
        int num=10;      //5*4*3*4*1
        int fact=1;

        for (int i=num; i>=1; i--)
        {
            fact=fact * i;
        }
        System.out.println(fact);


    }
}
