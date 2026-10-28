package Logical.MAP;

import java.util.LinkedHashMap;

public class Map3_LinkedHashMap
{
    static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(5,"ganesh");
        lhm.put(11, "mahesh");
        lhm.put(2,"suresh");
        lhm.put(4,"ramesh");
        lhm.put(3,"rahul");
        lhm.put(null,null);
        lhm.put(6,null);


        System.out.println(lhm);
    }
}
