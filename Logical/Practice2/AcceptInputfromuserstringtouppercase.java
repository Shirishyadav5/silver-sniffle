package Logical.Practice2;

import java.util.Scanner;

public class AcceptInputfromuserstringtouppercase
{
    static void main() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scan.next();


        System.out.println( str.toUpperCase());
    }
}
