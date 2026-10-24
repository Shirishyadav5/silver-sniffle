package Array;

public class Ex9_SwapData_inArray
{
    static void main(String[] args) {

        int [] ar={100,200,300,400,500};

        System.out.println(ar.length);

        int temp= ar[0];
        ar[0]=ar[1];
        ar[1]=temp;

        System.out.println("print data after swapping");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

    }
}
