package Logical.By_SanjaySir;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ex10_DateTime_getCurrentDate
{
    static void main(String[] args)
    {

        System.out.println(LocalDate.now());        //Return only current Date

        Date date= new Date();                  //Sat Oct 24 12:50:22 IST 2026 --> returns date & time
//        System.out.println(date);

        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh:mm:ss");        //formatting
        System.out.println(dateformat.format(date));


    }
}
