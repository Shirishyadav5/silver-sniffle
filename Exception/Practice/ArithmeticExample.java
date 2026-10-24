package Exception.Practice;

public class ArithmeticExample
{
    static void main(String[] args) {

        int a=20;
        int b=0;
        int c;

        try
        {
            c=a/b;
            System.out.println(c);
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("exception is handled");
        }

        finally {
            System.out.println("program is executed");
        }
    }
}
