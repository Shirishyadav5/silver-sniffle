package Exception;

public class Ex8_Handling_MultipleException
{

    static void main(String[] args) {

        String str="abcd";
        try {
            System.out.println(str.charAt(9));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
        System.out.println("Hi");

        System.out.println("-------------------------------------");
        int [] ar={10,20,30,40};

        try
        {
            System.out.println(ar[8]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        System.out.println("Hello");
    }
}
