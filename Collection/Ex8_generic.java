package Collection;

import java.util.ArrayList;

public class Ex8_generic
{
    static void main(String[] args) {

        ArrayList<String> ar=new ArrayList<>();
        ar.add("Amol");
        ar.add("Ramesh");
        ar.add("Rajesh");
        ar.add("Ganesh");
        ar.add("shirish");
        System.out.println(ar); //order of insertion is maintained

        for (String s1:ar)
        {
            System.out.println(s1);
        }



    }
}
