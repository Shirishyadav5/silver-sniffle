package Logical.Mock_Yogesh_GUptaa;

import java.util.Scanner;

public class Ex4_remainderoftwonumbers
{
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int num1=sc.nextInt();

        System.out.println("Enter second number: ");
        int num2=sc.nextInt();

        System.out.println("sum : "+(num1+num2));
        System.out.println("subtraction : "+(num1-num2));
        System.out.println("Multiplication : "+(num1*num2));
        System.out.println("Division : "+(num1/num2));
        System.out.println("remainder : "+(num1%num2));
    }
}
