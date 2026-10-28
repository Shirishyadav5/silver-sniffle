package Logical.By_SanjaySir;

import java.util.HashMap;
import java.util.Set;

public class Ex16_HashMap_OccuranceOfEachStringInAStatement
{
    static void main(String[] args)
    {
        String str = "my name is abc is abc is";
        String[] ar = str.split(" ");
        HashMap<String, Integer> mp=new HashMap<>();

        for (int i=0; i<=ar.length-1; i++)
        {
            String s1=ar[i];
            if (mp.containsKey(s1))
            {
                mp.put(s1,mp.get(s1)+1);
            }
            else
            {
                mp.put(s1,1);
            }
        }
        Set<String> allkeys = mp.keySet();
        System.out.println("print Occurrence of each word");

        for (String key:allkeys)
        {
            System.out.println(key+" "+mp.get(key));
        }

        System.out.println("print duplicate words");
        for (String key:allkeys)
        {
            if (mp.get(key)>1)
            {
                System.out.println(key+" "+mp.get(key));
            }
        }
        System.out.println("print unique word");
        for (String key:allkeys)
        {
            if (mp.get(key)==1)
            {
                System.out.println(key+" "+mp.get(key));
            }
        }

    }
}
