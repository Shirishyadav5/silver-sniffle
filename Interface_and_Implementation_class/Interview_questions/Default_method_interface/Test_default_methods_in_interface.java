package Interface_and_Implementation_class.Interview_questions.Default_method_interface;

public class Test_default_methods_in_interface
{

    static void main(String[] args) {

        Jio j=new Jio();
        j.data();
        j.ac();
        j.sms();

        System.out.println("-----------------");

        VI v=new VI();
        v.data();
        v.ac();
        v.sms();
    }
}
