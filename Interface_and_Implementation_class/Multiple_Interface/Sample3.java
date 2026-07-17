package Interface_and_Implementation_class.Multiple_Interface;
// Implementation class / sub class
public class Sample3 implements Sample1, Sample2
{
//    Example of multiple inheritance using interface
    public void m1()
    {
        System.out.println(Sample1.num1);
        System.out.println(num2);
        System.out.println("method m1 from Sample1 completed in IC");
    }

    public void m2()
    {
        System.out.println("method m2 from sample1 completed in IC");
    }

    public void m3()
    {
        System.out.println("method m3 from sample2 completed in IC");
    }

    public void m4()
    {
        System.out.println("method m4 from sample2 completed in IC");
    }
}
