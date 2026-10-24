package Array;

public class Ex3_PrintArrayinReverseOrder
{
    static void main() {
// Array declaration
        int [] ar=new int[4];

//        Array Initialization
        ar[0]=104;
        ar[1]=103;
        ar[2]=101;
        ar[3]=102;

//        usage
        System.out.println(ar[2]);
        System.out.println(ar.length);

        System.out.println("print origional data");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("print data in reverse order");
        for (int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }
    }
}
