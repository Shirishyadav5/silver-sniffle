package Interface_and_Implementation_class.Interview_questions.Default_method_interface;

public interface Simcard
{
//    Can we provide method definition in the interface?  yes - using default method


    void data();

    void ac();

//    default method in interface
    default void sms()
    {
        System.out.println("SMS: 500 sms");
    }
}
