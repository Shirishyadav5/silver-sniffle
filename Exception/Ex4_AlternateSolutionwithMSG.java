package Exception;

public class Ex4_AlternateSolutionwithMSG
{
    static void main(String[] args) {

        String str="abcd";

        try {
            System.out.println(str.charAt(9));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception is Handled");
            System.out.println(str.charAt(0));
        }
        System.out.println("Hello");
    }
}
