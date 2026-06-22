package Variables;

public class Demo1
{
    static void main()
    {

//       1. Variable Declaration (Allocating/Reserving memory)
        String sname;             //datatype variablename
        String studentDepartment;
        int RollNO;
        float Sper;
        char sgrade;

//       2. Variable initialization (Assigning or Inserting value)
        sname="Lokesh";                         //variablename="variable value"
        studentDepartment="Mechanical";
        RollNO=105;                        //-----"---= variable value
        Sper=60.3f;
        sgrade='B';



//       3. Variable Usage
        System.out.println("Student Name is "+sname);
        System.out.println("Student Department: "+studentDepartment);
        System.out.println("student Roll no is "+RollNO);
        System.out.println("student percentage: "+Sper+"%");
        System.out.println("student Grade is "+sgrade);
    }
}
