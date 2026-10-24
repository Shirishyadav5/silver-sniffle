package Exception;

public class Ex3_AlternateSolutionInCatchBlock
{
    static void main() {

        String str="abcd";

        try
        {
            System.out.println(str.charAt(9));      //risky code
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println(str.charAt(0));      //alternate code
        }

        System.out.println("Hi");
    }
}
