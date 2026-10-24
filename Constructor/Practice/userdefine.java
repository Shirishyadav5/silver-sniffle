package Constructor.Practice;

public class userdefine
{
    int num1;
    int num2;

    userdefine()
    {
        num1=10;
        num2=20;
    }

    public void add()
    {
        System.out.println(num1+num2);
    }
    public void sub()
    {
        System.out.println(num1-num2);
    }

    static void main() {

        userdefine u=new userdefine();
        u.add();
        u.sub();
    }
}
