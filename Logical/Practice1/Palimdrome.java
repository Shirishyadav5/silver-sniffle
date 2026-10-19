package Logical.Practice1;

public class Palimdrome {

    static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i=str.length()-1; i>=0; i--)
        {
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);

        if (rev.equals(str))
        {
            System.out.println("palimdrome");
        }
        else
        {
            System.out.println("not-palimdrome");
        }
    }


    public static class ReverseSTR
    {
        static void main(String[] args) {
            String str="Shirish";
            String rev="";

            for (int i=str.length()-1; i>=0; i--)
            {
                rev=rev+str.charAt(i);

            }
            System.out.println(rev);


        }



    }
}
