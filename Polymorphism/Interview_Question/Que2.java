package Polymorphism.Interview_Question;

public class Que2
{
//    5: can we overload main method? if yes then how?
//	-> yes ,  create 2 main methods 1 with String [], 1 with int num

    static void main(String[] args)
    {
        System.out.println("String [] args main method");
    }

    static void main(int[] args)
    {
        System.out.println("int [] args main method");
    }

    static void main(int num1)
    {
        System.out.println("int num1 main method");
    }
}
