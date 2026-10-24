package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex1_Arraylist
{
    static <object> void main(String[] args) {
                                        //initial capacity/default capacity=10
                                        //initial capacity=20
        ArrayList al=new ArrayList();
        al.add("shirish");
        al.add(101);
        al.add('A');
        al.add(78.4f);
        al.add(null);
        al.add(101);
        al.add(null);

        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains("shiri"));
        System.out.println(al.get(3));
        //update data
        al.set(2,'B');
        System.out.println(al);
        al.addFirst("mahesh");      //add first index value
        System.out.println(al);

//        add data between arraylist --> it get right shift operation
        al.add(3,200);
        System.out.println(al);

//        Remove data in between arraylist --> left shift operation
        al.remove(3);
        System.out.println(al);

        System.out.println("print data from arraylist using for loop");

        for (int i=0; i<= al.size()-1; i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("Print data from arraylist using for each loop");

        for (Object s1:al)
        {
            System.out.println(s1);
        }

        System.out.println("print data from arraylist using Iterator cursor");
//        1. copy all data from arraylist object into iterator object
        Iterator itr=al.iterator();
//        2. get one by one data from Iterator Object
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("print data from arraylist using listIterator cursor");
//        1. copy all data from arraylist object into listIterator cursor
        ListIterator litr=al.listIterator();
//      2. get one by one data from listIterator cursor
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }
    }
}
