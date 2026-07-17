package Array;

public class Ex7_StringArray_DeclarationInitialization_Insinglestep
{
    static void main(String[] args) {

        String [] ar={"mahesh","suresh","ramesh","mahesh","naresh"};

        System.out.println(ar.length);
        System.out.println(ar[2]);

        System.out.println("--print all data");
        for (String s1:ar)
        {
            System.out.println(s1);
        }
    }
}
