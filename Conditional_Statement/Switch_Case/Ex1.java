package Conditional_Statement.Switch_Case;

public class Ex1
{

    static void main() {

        int num=9;
        switch (num)
        {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
            default:
                System.out.println("Invalid data");
        }
    }
}
