package LOOP.DoWhile;

public class Print_1_to_5
{
    static void main() {
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("----------------------------");

        int j=1;
        do {
            System.out.println(j);
            j++;
            }
        while (j<=5);
    }
}
