package utilities;

import javax.swing.text.DateFormatter;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static void main(String[] args) {
        System.out.println(getDate());
    }

    public static String getDate(){
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");




        return dateObj.format(formatDate);
    }
}
