package Logical.MAP;

import java.util.HashMap;
import java.util.Set;

public class Ex1_HashMap
{
    static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(104,"ganesh");
        hm.put(55,"suresh");
        hm.put(101,"mahesh");
        hm.put(71,"rahul");
        System.out.println(hm);

//        Update value of Specific key
        hm.put(71,"RAHUL");
        System.out.println(hm);

//        check size of map (total no of keys)
        System.out.println(hm.size());

//        check any specific key available or not
        System.out.println(hm.containsKey(101));    //True/false

//        get value of any key
        System.out.println(hm.get(101));

        System.out.println("----------");

//        get all keys
        Set<Integer> Allkeys = hm.keySet();
        for (Integer key:Allkeys)
        {
            System.out.println(key);
        }

        System.out.println("---------");
//        get all keys and value
        for (Integer key:Allkeys)
        {
            System.out.println(key+" "+hm.get(key));
        }
    }
}
