package Exception;

public class Ex7_Correct_Way_ofCalling_Generic_Exception
{
    static void main(String[] args) {

        String str="abcd";
        try
        {
            System.out.println(str.charAt(9));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException handled");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutofBoundsException handled");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("GenericException Handled");
        }
        System.out.println("Hello");


    }
}
