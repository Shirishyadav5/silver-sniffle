package Collection;

import java.util.TreeSet;

public class Ex7_Treeset1
{
    static void main(String[] args) {

        TreeSet<Integer> tr=new TreeSet<Integer>();
        tr.add(102);
        tr.add(107);
        tr.add(106);
        tr.add(108);
        tr.add(105);
        tr.add(104);
        tr.add(103);
        tr.add(101);

        System.out.println(tr);

        for (Integer s1:tr)
        {
            System.out.println(s1);
        }
    }
}
