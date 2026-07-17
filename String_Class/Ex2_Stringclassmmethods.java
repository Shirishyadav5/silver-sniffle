package String_Class;

public class Ex2_Stringclassmmethods
{

    static void main(String[] args)
    {
        String s1="velocity";
        String s2="abcabab";
        String s3="my";
        String s4="notebook";
        String s5="my name is abc";
        String s6=" abcd xyz ";

        System.out.println(s1.indexOf('o'));
        System.out.println(s2.indexOf('a'));
        System.out.println(s2.lastIndexOf('a'));

        System.out.println(s1.substring(4));
        System.out.println(s1.substring(1,6));

        System.out.println(s3.concat(s4));
        System.out.println(s3+s4);

        System.out.println(s5.replace("abc","xyz"));

        System.out.println(s6.trim());

        String [] ar=s5.split(" ");
        System.out.println(ar[3]);

        System.out.println("--print all word from array");
        for (String str2:ar)
        {
            System.out.println(str2);
        }

    }
}
