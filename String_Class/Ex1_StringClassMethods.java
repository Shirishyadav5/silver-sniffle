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

        System.out.println(s1.substring(3,7));
        System.out.println(s1.substring(3));
        System.out.println(s1.replace("city","shiva"));
        System.out.println(s1.replace("v","V"));
        System.out.println(s1.replaceAll("city","shiva"));
        System.out.println(s1.replaceAll("v","V"));
        System.out.println(s1.replaceFirst("v","V"));
        System.out.println(s1.indexOf("v"));
        System.out.println(s1.lastIndexOf("v"));
        System.out.println(s1.concat(" shiva"));
        System.out.println(s1.trim());
        System.out.println(s1.split("c")[0]);
        System.out.println(s1.split("c")[1]);
//        System.out.println(s1.split("c")[2]);
//        System.out.println(s1.split("c")[3]);
        System.out.println(s1.split("c")[0].concat(s1.split("c")[1]));
//        System.out.println(s1.split("c")[0].concat(s1.split("c")[1]).concat(s1.split("c")[2]));




















    }
}
