package Group_A;

public class UseofstaticandNonstatic
{
    String studname;
    int studID;
    static char studdiv;

    public void Studdetails()
    {
        System.out.println("studname : "+studname);
        System.out.println("studID: "+studID);
        System.out.println("studdiv: "+studdiv);
    }

    public static void main(String[] args)
    {
        UseofstaticandNonstatic s1=new UseofstaticandNonstatic();
        s1.studname="Nirank";
        s1.studID=101;

        studdiv='A';

        UseofstaticandNonstatic s2=new UseofstaticandNonstatic();
        s2.studname="Shirish";
        s2.studID=102;

        studdiv='B';

        UseofstaticandNonstatic s3=new UseofstaticandNonstatic();
        s3.studname="Alpika";
        s3.studID=103;

        studdiv='C';


        s1.Studdetails();
        s2.Studdetails();
        s3.Studdetails();
    }
}
