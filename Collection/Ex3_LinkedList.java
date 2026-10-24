package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3_LinkedList
{
    static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.add("Ganesh");
        ll.add(101);
        ll.add('B');
        ll.add(null);
        ll.add(101);
        ll.add(null);
        ll.add(37.334f);
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.contains("Ganesh"));
        System.out.println(ll.isEmpty());
        System.out.println(ll.get(5));
        ll.add(4,200);
        System.out.println(ll);
        ll.remove(4);
        System.out.println(ll);
        System.out.println("----Print data from linkedlist using for loop");
        for (int i=0; i<=ll.size()-1; i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println("----print data from linkedlist using for each loop");
        for (Object s1:ll)
        {
            System.out.println(s1);
        }
        System.out.println("----print data from linkedlist using iterator cursor");
        Iterator itr=ll.iterator();     //copy all data from linkedlist object into iterator object
        while (itr.hasNext())           //get 1 by 1 data from iterator object
        {
            System.out.println(itr.next());
        }
        System.out.println("----print data from linkelist using listiterator cursor");
        ListIterator litr=ll.listIterator();
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }
        System.out.println("----print data from linkedlist using enumeration cursor");
//      this cursor is not use for linkedlist
//
//        Enumeration enu= (Enumeration) ll.element();
//        while (enu.hasMoreElements())
//        {
//            System.out.println(enu.hasMoreElements());
//        }


    }
}
