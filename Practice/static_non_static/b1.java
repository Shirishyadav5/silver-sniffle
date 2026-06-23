package Practice.static_non_static;

public class b1
{
//    Print "Hello my name is SHirish" using non-static method
 String name;
    public void story()
    {
        System.out.println("Hello my name is: "+name);
    }

    static void main() {

        b1 object=new b1();
        object.name="Shirish";
        object.story();

    }

}
