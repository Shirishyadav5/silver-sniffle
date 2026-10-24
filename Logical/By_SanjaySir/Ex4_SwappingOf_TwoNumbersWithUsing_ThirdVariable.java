package Logical.By_SanjaySir;

public class Ex4_SwappingOf_TwoNumbersWithUsing_ThirdVariable
{
    static void main(String[] args) {

        int num1=10;
        int num2=20;
        int temp;

        System.out.println("Before swap");
        System.out.println("Number1: "+num1);
        System.out.println("number2: "+num2);

        temp=num1;      // temp=10;
        num1=num2;      // num1=20;
        num2=temp;      // num2=10;

        System.out.println("After swap");
        System.out.println("number1: "+num1);
        System.out.println("number2: "+num2);


    }
}
