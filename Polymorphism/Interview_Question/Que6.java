package Polymorphism.Interview_Question;

public class Que6 extends Que5

    //6: can we override static method in java?
	//-> No

{
    public static void m1()
    {
        System.out.println("method m1 is running");
    }

    static void main(String[] args) {

        Que5.m1();
    }
}
//6: can we override static method in java?
//	-> No