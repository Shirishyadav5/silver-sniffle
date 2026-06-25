package Logical;

public class Print_star_pattern
{
//*
//**
//***
//****
//*****     print this triangle
    static void main() {

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
