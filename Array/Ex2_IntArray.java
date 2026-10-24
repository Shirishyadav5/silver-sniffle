package Array;

public class Ex2_IntArray
{
    static void main(String[] args) {
//      Array declaration
        int [] ar=new int[4];
//      Array initialization

        ar[0]=101;
        ar[1]=201;
        ar[2]=203;
        ar[3]=204;
//        Usage
        System.out.println(ar[2]);
        System.out.println(ar.length);

        System.out.println("-----print all data------");
        for (int i=0; i<=3; i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("--------------");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
