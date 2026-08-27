package Logical.By_SanjaySir;

import java.util.Scanner;

public class Ex8_AcceptInputFrom_user_INT
{
    static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1=scan.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = scan.nextInt();

        System.out.println(num1+num2);

    }
}
