package Exception;

public class Ex2_Empty_CatchBlock
{

    static void main(String[] args) {

        String str="abcd";

        try
        {
            System.out.println(str.charAt(8));
        }
        catch (StringIndexOutOfBoundsException e)
        {

        }
        System.out.println("hi");
    }
}
