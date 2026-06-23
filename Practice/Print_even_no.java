package Practice;

public class Print_even_no
{
    static void main() {

        for (int i=0; i<=99; i=i+2)
        {
            System.out.println(i);
        }

        int j=0;
        while (j<=99)
        {
            System.out.println(j);
            j=j+2;
        }

        int x=0;
        do {
            System.out.println(x);
            x=x+2;
        }
        while (x<=99);
    }
}
