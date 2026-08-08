package Exception;

public class Ex6_GenericException
{
    static void main(String[] args) {

        String str="abcd";

        try
        {
            System.out.println(str.charAt(9));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Generic Exception handled");
        }
        System.out.println("Hello");
    }
}
