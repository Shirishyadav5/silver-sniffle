package Logical.By_SanjaySir;

public class Ex3_SwappingOf_Two_numbers_WithoutusingThirdVariable
{
    static void main(String[] args) {

        int num1=10;
        int num2=20;

        System.out.println("Before swap");
        System.out.println("Number1: "+num1);
        System.out.println("number2: "+num2);

        num1=num1+num2;  //10+20=30
        num2=num1-num2;  //30-20=10
        num1=num1-num2;  //30-10=20

        System.out.println("Afetr Swap");
        System.out.println("number1: "+num1);
        System.out.println("number2: "+num2);
    }
}
