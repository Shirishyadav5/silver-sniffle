package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex1_Arraylist1
{
    static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add("shirish");
        al.add(100);
        al.add(null);
        al.add('A');
        al.add(100);
        al.add(null);
        System.out.println(al);
        System.out.println(al.size());  //Returns the number of elements in this list.
        System.out.println(al.get(2));  //Returns the element at the specified position in this list
        System.out.println(al.isEmpty()); //Returns true if this list contains no elements. or false
        al.add(2,200);
        System.out.println(al);//add data in arraylist-->data move Right shift operation
        al.remove(2);               //remove data --> data move left after removed data
        System.out.println(al);

        System.out.println("-----print data from arraylist using for loop");
        for (int i=0; i<=al.size()-1; i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("-----print data from arraylist using for each loop");
        for (Object s1:al)
        {
            System.out.println(s1);
        }
        System.out.println("----print data from arraylist using iterator cursor -->it is univeral cursor-->use for all 7 class");
        Iterator itr=al.iterator(); //copy all data from arraylist object into iterator object
        while (itr.hasNext())       //get 1 by 1 data from iterator object
        {
            System.out.println(itr.next());
        }
        System.out.println("----print data from arraylist using listiterator cursor->use for 3 class");
        ListIterator litr=al.listIterator();//copy all data from arraylist object into listiterator objeect
        while (litr.hasNext())  //get 1 by 1 data from listIterator object
        {
            System.out.println(litr.next());
        }

    }
}
