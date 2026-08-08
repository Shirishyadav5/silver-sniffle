package Exception;

public class Ex10_FinallyBlock
{
    static void main(String[] args) {

        String str="abcd";

        try
        {
            System.out.println(str.charAt(9));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        finally
        {
            System.out.println("Running Finally Block");
        }
        System.out.println("Hello");
    }
}
