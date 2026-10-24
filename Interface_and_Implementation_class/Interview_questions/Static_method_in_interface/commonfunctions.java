package Interface_and_Implementation_class.Interview_questions.Static_method_in_interface;

public interface commonfunctions
{
    public static void captureSS()
    {
        System.out.println("running code to capture ss");
    }


    public static void getDataFromExcel()
    {
        getExcelPath();
        System.out.println("running code to getDataFromExcel");
    }


    public static void writeDataInExcel()
    {
        getExcelPath();
        System.out.println("running code to writeDataInExcel");
    }

//    Can we create private methods in the interface?  yes
    private static void getExcelPath()
    {
        System.out.println("get excel path");
    }
}
