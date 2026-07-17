package Practice.Practice1.Generalization;

public class VI implements Simcard
{
    public void ac()
    {
        System.out.println("ac: unlimited");
    }

    public void sms()
    {
        System.out.println("sms: 100 Daily");
    }

    public void data()
    {
        System.out.println("data: 2GB");
    }
}
