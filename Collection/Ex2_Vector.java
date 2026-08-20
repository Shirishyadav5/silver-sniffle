package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex2_Vector
{
    static void main(String[] args) {
        Vector v=new Vector();
        v.add("Rajesh");
        v.add(101);
        v.add('A');
        v.add(null);
        v.add(46.3f);
        v.add(101);
        v.add(null);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.contains("raju"));
        System.out.println(v.isEmpty());
        System.out.println(v.get(4));
        v.add(4,76.87d);
        System.out.println(v);
        v.remove(4);
        System.out.println(v);
        System.out.println("------Print data from vector using for loop ");
        for (int i=0; i<=v.size()-1; i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println("------print data from vector using for each loop");
        for (Object s1:v)
        {
            System.out.println(s1);
        }
        System.out.println("-----Print data from vector using Iterator cursor");
        Iterator itr=v.iterator();  //copy all data from vector and store it into Iterator object
        while (itr.hasNext())       //get 1 by 1 data from iterator object
        {
            System.out.println(itr.next());
        }
        System.out.println("-----Print data from vector using Listiterator cursor");
        ListIterator litr=v.listIterator();     //copy all data from vector object into listiterator object
        while (litr.hasNext())              //get 1 by 1 data from listiterator object
        {
            System.out.println(litr.next());
        }
        System.out.println("----Print data from vector using Enumeration cursor");
        Enumeration enu=v.elements();   //copy all data from vector object into enumeration object
        while (enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }

    }
}
