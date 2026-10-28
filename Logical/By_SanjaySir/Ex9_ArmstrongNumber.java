package Logical.By_SanjaySir;

public class Ex9_ArmstrongNumber
{
    static void main(String[] args) {

        int num=153;
        int orgnum=num;
        int sum=0;
//              153>0
        while (num>0)
        {
            int rem=num%10;  //153/10=15.3
                            // 15%10=1.5
                            // 1%10=1
            sum=sum+rem*rem*rem; //27+125+1=153
            num=num/10;     //153/10=15, 15/10=1, 1/10=1
        }
        if (orgnum==sum)
        {
            System.out.println("given number is armStrong num");
        }
        else
        {
            System.out.println("given number is not armStrong num");
        }
    }
}
