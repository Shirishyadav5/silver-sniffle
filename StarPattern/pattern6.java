package StarPattern;

public class pattern6
{
    static void main(String[] args) {

/*      *******
        *****
        ***
        *
*/
        int star=7;  //5, 3, 1
        for (int i=1; i<=4; i++)
        {
            for (int j=1; j<=star; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            star=star-2;
        }
    }
}
