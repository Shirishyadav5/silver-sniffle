package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex4_Hashset
{
    static void main(String[] args) {

        HashSet hs=new HashSet();
        hs.add("Amol");
        hs.add(101);
        hs.add(null);
        hs.add('A');
        hs.add(23.33f);
        hs.add(43.43d);
        hs.add(101);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(101));
        hs.remove('A');
        System.out.println(hs);
//        using for loop we cant run hashset because start condition and end condition are not info

        System.out.println("--print data using for each loop");
        for (Object s1:hs)
        {
            System.out.println(s1);
        }
        System.out.println("--print data using iterator cursor");
        Iterator itr=hs.iterator();     //copy all data from hashset into iterator object
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("----------");
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
