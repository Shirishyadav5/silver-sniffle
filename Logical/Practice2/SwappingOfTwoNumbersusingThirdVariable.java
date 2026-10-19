package Logical.Practice2;

public class SwappingOfTwoNumbersusingThirdVariable
{
    static void main(String[] args)
    {
        int num1=10;
        int num2=20;
        int temp=0;

        temp=num1+num2; //10+20=30
        num2=temp-num2; //30-20=10
        num1=temp-num2; //30-10=20

        System.out.println(num1);
        System.out.println(num2);


    }
}
