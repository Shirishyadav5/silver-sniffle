package Access_specifier_1.Public_otherpackage;

import Access_specifier_1.Public.Test1;

public class Test3
{
    static void main() {

        Test1 t1=new Test1();
        t1.m2();
        System.out.println(t1.num);
    }
}
