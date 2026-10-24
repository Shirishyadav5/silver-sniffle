package Practice;

public class Print_Odd
{
//    print odd numbers from 0 to 99

    static void main() {

        for (int i=1; i<=99; i=i+2)
        {
            System.out.println(i);
        }

        System.out.println("using while loop");

        int j=1;
        while (j<=99)
        {
            System.out.println(j);
            j=j+2;
        }

        System.out.println("using do while loop");

        int x=1;
        do {
            System.out.println(x);
            x=x+2;
        }
        while (x<=99);

}
}
