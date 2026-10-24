package Exception.Practice;

public class Null_Pointer_Exception
{
    static void main(String[] args) {

        String str=null;

        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("object is null");
        }
    }
}
