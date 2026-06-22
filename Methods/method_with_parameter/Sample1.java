package Methods.method_with_parameter;

public class Sample1
{
    public static void main(String[] args) {

        addition(10,20);
        addition(20,40);      //static method from same class
        System.out.println("----------------------");

        milti(10,20);        //Static method from same class
        System.out.println("-----------------------");

        Sample2.subtraction(20,25);   //Static method from different class

        System.out.println("--------------------------");

        Sample2.square(5);     //Static method from Different class
        System.out.println("------------------------");

        Sample2 s2=new Sample2();
        s2.Squareofnum(9);




    }

    public static void addition(int num1, int num2)
    {
        int sum=num1+num2;
        System.out.println(sum);
    }

    public static void milti(int num1, int num2)
    {
        int multi=num1*num2;
        System.out.println(multi);
    }
}
