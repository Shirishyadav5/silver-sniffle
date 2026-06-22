package Methods.Method_with_string_parameter;

public class Test
{
    static void main()
    {
        studentdetails("Rajesh",101,20.3f,'A');
        System.out.println("=====================================");
        studentdetails("ZAIKA",103,30.4f,'S');



    }

    public static void studentdetails(String Name, int Rollnum, float per, char Grade)
    {
        System.out.println(Name);
        System.out.println(Rollnum);
        System.out.println(per);
        System.out.println(Grade);
    }
}
