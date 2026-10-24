package Conditional_Statement.If;

public class Ex4 {
    static void main() {


        int time = 20;

        // syntax: variable=(condition)? value_if_true : value_if_false;

        String greeting = (time > 18) ? "Good day." : "Good evening.";

        System.out.println(greeting);

    }
}
