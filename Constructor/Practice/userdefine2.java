package Constructor.Practice;

public class userdefine2
{
//    User define constructor without parameter
    int num1;
    int num2;
    userdefine2()
    {
        num1=1;
        num2=2;

    }

    public void multi()
    {
        System.out.println(num1*num2);
    }

    static void main() {
        userdefine2 u=new userdefine2();
        u.multi();
    }

}
