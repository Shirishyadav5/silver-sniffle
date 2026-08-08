package Exception;

public class Ex1_Array
{
    static void main(String[] args) {

        int [] ar={10,20,30,40};

        try
        {
            System.out.println(ar[7]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception handled");
        }

        System.out.println("hi, hello");

    }
}
