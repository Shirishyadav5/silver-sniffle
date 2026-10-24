package Array;

public class Ex5_DefaultValueofArray
{
    static void main(String[] args) {

        System.out.println("---String Array----");
        String [] ar=new String[5];
        ar[0]="Jelly";
        ar[1]="candy";
        for (String gems:ar)
        {
            System.out.println(gems);
        }

        System.out.println("---Int Array---");
        int [] ar1=new int[4];
        ar1[0]=78;

        for (int num:ar1)
        {
            System.out.println(num);
        }
    }
}
