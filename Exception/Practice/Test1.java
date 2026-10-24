package Exception.Practice;

public class Test1
{
    static void main(String[] args)
    {
        String str="velocity";

        System.out.println(str.length());

        try
        {
            System.out.println(str.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception Handled");
        }


        System.out.println(str.replace("v","V"));
        System.out.println(str.contains("h"));

    }
}
