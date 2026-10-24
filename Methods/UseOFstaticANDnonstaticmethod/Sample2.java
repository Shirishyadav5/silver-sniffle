package Methods.UseOFstaticANDnonstaticmethod;

public class Sample2
{
    static void main() {

        Sample1 s1=new Sample1();
        s1.Employeename="Nirank";
        s1.empID=101;
//        s1.empceo="abc";
        Sample1.empceo="abc";

        Sample1 s2=new Sample1();
        s2.Employeename="Sanjay";
        s2.empID=102;
//        s2.empceo="abc";
        Sample1.empceo="abc";

        Sample1 s3=new Sample1();
        s3.Employeename="Rajesh";
        s3.empID=103;
//        s3.empceo="xyz";
        Sample1.empceo="XYZ";

        s1.employeedetails();
        s2.employeedetails();
        s3.employeedetails();

    }
}
