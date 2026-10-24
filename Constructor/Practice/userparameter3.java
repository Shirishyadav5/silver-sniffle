package Constructor.Practice;

public class userparameter3
{
    int num1;
    int num2;

    userparameter3(int a, int b)
    {
        num1=a;
        num2=b;

    }
    public void add()
    {
        System.out.println(num1+num2);
    }

    public static void main(String[] args)
    {
        userparameter3 u3=new userparameter3(2,2);
        u3.add();
        System.out.println("----------------------");

        userparameter4 u4=new userparameter4(2);
        u4.square();
    }
}
