package Logical.By_SanjaySir;

import java.util.HashMap;
import java.util.Set;

public class Ex15_HashMap_OccuranceOfEachCharInAString
{
    static void main(String[] args)
    {
        String str="abcaba";
        HashMap<Character,Integer> mp=new HashMap<>();

        for (int i=0; i<=str.length()-1; i++)
        {
            char s1 = str.charAt(i);
            if (mp.containsKey(s1))
            {
                mp.put(s1, mp.get(s1)+1);
            }
            else
            {
                mp.put(s1,1);
            }
        }
        Set<Character> allkeys = mp.keySet();
//      get occurrence of key
        System.out.println("Occurrence of key");
        for (Character key:allkeys)
        {
            System.out.println(key+" "+mp.get(key));
        }

//      print only duplicate character
        System.out.println("Print only duplicate key");
        for (Character key:allkeys)
        {
           if (mp.get(key)>1)  //condition for duplicate key
           {
               System.out.println(key+" "+mp.get(key));
           }
        }

//      print only unique chars
        System.out.println("print only unique chars");
        for (char key:allkeys)
        {
            if (mp.get(key)==1)  //condition for duplicate key
            {
                System.out.println(key+" "+mp.get(key));
            }
        }
    }
}
