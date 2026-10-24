package Exception;

public class Ex5_MultipleCatch_Block_for_single_tryBlock
{
    static void main(String[] args) {

        String str="abcd";

        try {
            System.out.println(str.charAt(9));
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException is Handled");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }

        System.out.println("hello");
    }
}
