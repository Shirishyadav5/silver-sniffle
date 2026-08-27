package Logical.By_SanjaySir;

import java.util.Scanner;

public class Ex8_AcceptINputFromUSER_STRING
{
    static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Name:- ");

        String name = scan.next();
        System.out.println(name.toUpperCase());

    }
}
