package Interface_and_Implementation_class.Interview_questions.Default_method_interface;

public class VI implements Simcard
{
    public void data()
    {
        System.out.println("data: 1.5 GB");
    }

    public void ac()
    {
        System.out.println("ac: 500 calls");
    }
}
