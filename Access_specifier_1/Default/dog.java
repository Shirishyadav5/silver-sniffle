package Access_specifier_1.Default;

public class dog extends animal
{

    @Override
    public void display()
    {
        System.out.println("I am a dog");
    }

    public void printMessage()
    {
        display();
        super.display();
    }
}

class Main
{
    public static void main(String[] args)
    {
        dog dog1 = new dog();
        dog1.printMessage();
    }
}

