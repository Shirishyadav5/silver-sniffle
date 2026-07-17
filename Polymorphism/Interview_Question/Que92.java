package Polymorphism.Interview_Question;

public class Que92
{
    static void main(String[] args) {


        Que91.main(args);
        Que91.main(args);
    }
}
// This HIDES Parent.main, it does NOT override it
// Calls Parent.main() because resolution happens at compile time based on reference type