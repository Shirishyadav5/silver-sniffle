package Exception.Practice;

public class InterviewScenario
{
    static void main() {

        String str=null;

        try {

            System.out.println(str.length());

            int a=10/0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("String is Null and can not divide by 0");
        }
        finally {
            System.out.println("finally block always executed");
        }
    }
}
