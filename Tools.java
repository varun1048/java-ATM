package atm;

import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.io.File;

class FileOperation{
}

public class Tools extends FileOperation{

    public static void clrscr(){   
    System.out.print("\033[H\033[2J");   
    System.out.flush();   
   } 

    public  String DateTime() {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = current.format(formatter);
        // System.out.println("Current Date is: " + formatted);
    return formatted+"\n";
    }
}