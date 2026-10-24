package String_Class;

public class SAMPLE1

{
    static void main(String[] args) {

// 5.   Object creation of String
//        1. without using new keyword
        String S1="abc";

//        2. using new keyword
        String s2=new String("XYZ");

//  6. Object creation while
        //1: only declaration of string
        String s3;

        //2: declaration and initialization of string
        String s4="abcd";

//  7.  String objects are immutable
        String s5="abc";
        s5=s5+"XYZ";
        s5=s5+"cd";
        System.out.println(s5);

//  String Pool Area
//     1:Constant pool area(object creation of string using without new keyword)
        String s6="abc";
        String s7="abc";
        String s8="abc";
        String s9="abc1";

//     2: non-constant pool area(object creation using new keyword)
        String s10=new String("abc");
        String s11=new String("abc");
        String s12=new String("abc1");

        System.out.println(s6==s7);
        System.out.println(s7==s8);
        System.out.println(s7==s9);
        System.out.println(s7==s10);
        System.out.println(s11==s10);
    }
}
