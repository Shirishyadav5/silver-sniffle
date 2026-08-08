package Exception.Practice;

public class onlytry
{
    static void main() {

        try {
            int a=10/0;

        }
        finally {
            System.out.println("finally block exc");
        }

        System.out.println("Hi");
    }
}
