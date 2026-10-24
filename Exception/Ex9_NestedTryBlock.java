package Exception;

public class Ex9_NestedTryBlock
{
    static void main(String[] args) {

        String str="abcd";
        int [] ar={10,20,30,40};

        try
        {
            try
            {
                System.out.println(ar[9]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBoundsException handled");
            }
            System.out.println(str.charAt(9));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        System.out.println("Hello");
    }
}
