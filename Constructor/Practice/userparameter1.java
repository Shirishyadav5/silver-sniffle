package Constructor.Practice;

public class userparameter1
{
    int num1;
    int num2;

    userparameter1(int a, int b)
    {
        num1=a;
        num2=b;
    }

    public void div()
    {
        System.out.println(num1/num2);
    }
    public void sub()
    {
        System.out.println(num1-num2);
    }

    static void main() {

        userparameter1 u1=new userparameter1(10,20);
        u1.div();
        u1.sub();

        System.out.println("-----------------");

        userparameter2 u2=new userparameter2(10,20);
        u2.add();
        u2.multi();
    }
}
