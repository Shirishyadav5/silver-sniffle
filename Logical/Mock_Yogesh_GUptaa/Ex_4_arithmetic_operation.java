package Logical.Mock_Yogesh_GUptaa;

import org.bouncycastle.oer.Switch;

public class Ex_4_arithmetic_operation
{
    static void main(String[] args) {

        int num1=8;
        int num2=20;
        String result="Remainder";

        switch (result)
        {
            case "addition":
                System.out.println("addition is:"+(num1+num2));break;

            case "Subtraction":
                System.out.println("sub is:"+(num1-num2)); break;

            case "Multiplication":
                System.out.println("Multiplication is:"+(num1*num2)); break;

            case "Division":
                System.out.println("Division is:"+(num1/num2)); break;

            case "Remainder":
                System.out.println("Remainder is:"+(num2%num1));






        }

    }
}
