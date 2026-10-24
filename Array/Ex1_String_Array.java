package Array;

public class Ex1_String_Array
{

    static void main(String[] args) {

//        1. Array Declaration
        String [] ar=new String[5];

//        2. Array Initialization
        ar[0]="mahesh";
        ar[1]="ramesh";
        ar[2]="ganesh";
        ar[3]="suresh";
        ar[4]="naresh";
     //   ar[5]="rajesh";    //invalid index- //array index is out of bonds Exception

//    3. Array Usage
        System.out.println(ar[2]);
        System.out.println(ar.length);

        System.out.println("-----print all data from string array-----");
        for (int i=0; i<=4; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("-------");
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

    }
}
