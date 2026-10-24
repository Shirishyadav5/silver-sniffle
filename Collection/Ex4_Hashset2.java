package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex4_Hashset2
{
    static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add("shirish");
        al.add(101);
        al.add(null);
        al.add('A');
        al.add(101);
        al.add(23.33f);
        al.add(null);
        System.out.println(al);

        HashSet hs=new HashSet(al);
        System.out.println(hs);
    }
}
