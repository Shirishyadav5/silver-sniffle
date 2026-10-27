package Logical.By_SanjaySir;

public class Ex13_String7_findCountOf_spaces_SpecialChars_Digit_alphabets
{
    static void main(String[] args) {

        String str="5abcd123xyz #";
        int SpeacialCharCount=0;
        int alphabetscounts=0;
        int spacecount=0;
        int digitcount=0;

        for (int i=0; i<=str.length()-1; i++)
        {
            char s1 = str.charAt(i);
            if (Character.isDigit(s1))
            {
                digitcount++;
            }
            else if (Character.isWhitespace(s1))
            {
                spacecount++;
            }
            else if (Character.isLetter(s1))
            {
                alphabetscounts++;
            }
            else
            {
                SpeacialCharCount++;
            }
        }

        System.out.println("SpecialcharCount: "+SpeacialCharCount);
        System.out.println("alphabetscounts: "+alphabetscounts);
        System.out.println("Spacecounts: "+spacecount);
        System.out.println("digitcounts: "+digitcount);
    }
}
