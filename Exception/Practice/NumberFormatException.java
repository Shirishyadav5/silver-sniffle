package Exception.Practice;

public class NumberFormatException
{
    static void main() {

        String str="abc";

        try
        {
            int num= Integer.parseInt(str);
            System.out.println(num);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Invalid Number format");
        }
    }
}
