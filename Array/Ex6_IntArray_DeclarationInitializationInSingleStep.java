package Array;

public class Ex6_IntArray_DeclarationInitializationInSingleStep
{
    static void main(String[] args) {

        int[] ar={40,50,30,10,20};

        System.out.println(ar.length);
        System.out.println(ar[2]);

        System.out.println("print all data");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("---------------");
        for (int s1:ar)
        {
            System.out.println(s1);
        }
    }
}
