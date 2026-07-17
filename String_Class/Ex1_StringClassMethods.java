package String_Class;

public class Ex1_StringClassMethods
{
    static void main(String[] args) {

        String s1="velocity";
        String s2="ABCD";
        String s3="abcd";
        String s4="my name is xyz";
        String s5=" ";

//        1.Length()
        System.out.println(s1.length());

//       2.toUppercase()
        System.out.println(s1.toUpperCase());
//        s1=s1.toUpperCase();        //--

//        3. tolowercase()
        System.out.println(s2.toLowerCase());

//        4.equals
        System.out.println(s2.equals(s3));      //false--Compare data and case
        System.out.println(s2.equalsIgnoreCase(s3));   //compare only data
        System.out.println(s4.contains("xyz"));         //check contains data
        System.out.println(s4.startsWith("my"));
        System.out.println(s4.endsWith("xyz"));

        System.out.println("-----------------------------");

        System.out.println(s1.isEmpty());
        System.out.println(s5.isEmpty());
        System.out.println(s5.isBlank());

        System.out.println(s1.charAt(7));



















    }
}
