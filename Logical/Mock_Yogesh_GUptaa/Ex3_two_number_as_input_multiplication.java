package Logical.Mock_Yogesh_GUptaa;

import java.util.Scanner;

public class Ex3_two_number_as_input_multiplication
{
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();

        System.out.println("Enter second number: ");
        int num2=sc.nextInt();

        int c=num1*num2;
        System.out.println(c);

        sc.close();
    }
}
