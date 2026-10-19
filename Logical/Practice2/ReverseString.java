package Logical.Practice2;

public class ReverseString
{
    static void main(String[] args) {

        String str="member";
        String rev="";

        for (int i=str.length()-1; i>=0; i--)
        {
            rev =rev+str.charAt(i);
        }
        System.out.println(rev);

        System.out.println(str.substring(4,5));
        System.out.println(str.charAt(3));
        System.out.println(str.replace("member","Shivay"));
        System.out.println(str.contains("m"));

    }
}
