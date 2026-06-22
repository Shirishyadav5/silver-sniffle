package Variables.Practices;

public class Test
{
    static void main()
    {
//      Declaring Int variable
        int mathscore=36;
        int sciencescore=49;
        int history=38;
        int English=37;

//        calculating total score
        int totalscore=mathscore+English+history+sciencescore;

//        average score
        double averagescore= totalscore/4.0;

//        Result
        System.out.println("Total score is "+totalscore);
        System.out.println("Average score is "+averagescore);

    }
}
