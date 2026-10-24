package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex5_LinkedHashset
{
    static void main(String[] args) {

        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("Shirish");
        lhs.add(101);
        lhs.add('A');
        lhs.add(null);
        lhs.add(34.3f);
        lhs.add(101);
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains(101));

//        remove data in linkedlist
        lhs.remove(null);
        System.out.println(lhs);
        System.out.println("--print data using for each loop");
        for (Object s1:lhs)
        {
            System.out.println(s1);
        }
        System.out.println("--print data using iterator cursor");
        Iterator itr=lhs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
