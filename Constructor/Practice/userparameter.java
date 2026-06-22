package Constructor.Practice;

public class userparameter
{
    int num1;
    int num2;

    userparameter(int a, int b)
    {
        num1=a;
        num2=b;
    }

    public void div()
    {
        System.out.println(num2/num1);
    }

    static void main() {
        userparameter u=new userparameter(10,20);
        u.div();
    }
}
