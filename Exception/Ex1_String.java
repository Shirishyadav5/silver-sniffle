package Exception;

public class Ex1_String
{
    static void main() {

        String s1="abcd";

        try
        {
            System.out.println(s1.charAt(6));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception handled");
        }

        System.out.println("hi");
    }
}
