package Array;

public class Ex1_CharArray
{
    static void main(String[] args) {

        char [] ar=new char[5];

        ar[0]='a';
        ar[1]='B';
        ar[2]='C';
        ar[3]='D';
        ar[4]='E';

        System.out.println(ar[2]);
        System.out.println(ar.length);

        System.out.println("---print all data");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("---using for each array");
        for (char grade:ar)
        {
            System.out.println(grade);
        }


    }
}
