package Array.Practice;

public class Ex2
{
    static void main(String[] args) {

        String [] ar={"Volvo","BMW","Ford","Mazda"};

//        Access an element by index will be 0
        System.out.println(ar[0]);

        ar[0]="TATA";           //update 0 index element
        System.out.println(ar[0]);

//        Get the total number of car
        System.out.println(ar.length);

//        Get all the cars using loop
        for (int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
//        Get all cars using for each loop
        for (String car:ar)
        {
            System.out.println(car);
        }
    }
}
