package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex6_Treeset
{
    static void main(String[] args) {

        TreeSet tr=new TreeSet();
        tr.add(108);
        tr.add(106);
        tr.add(107);
        tr.add(105);
        tr.add(104);
        tr.add(102);
        tr.add(103);
        tr.add(101);

        System.out.println(tr);
        System.out.println(tr.size());
        System.out.println(tr.isEmpty());
        System.out.println(tr.contains(107));
//        remove data
        tr.remove(104);
        System.out.println(tr);

//        remove first position data
        tr.pollFirst();
        System.out.println(tr);

//        remove last position data
        tr.pollLast();
        System.out.println(tr);

//        get first position data
        System.out.println(tr.getFirst());

//        get last position data
        System.out.println(tr.getLast());
        System.out.println("--print data using for each loop");
        for (Object s1:tr)
        {
            System.out.println(s1);
        }
        System.out.println("--print data using iterator cursor");
        Iterator itr=tr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("--print data using DescendingIterator cursor");
        Iterator ditr=tr.descendingIterator();
        while (ditr.hasNext())
        {
            System.out.println(ditr.next());
        }
        System.out.println("---");
        tr.clear();
        System.out.println(tr);
    }
}
