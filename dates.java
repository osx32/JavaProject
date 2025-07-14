//import java.time.LocalDate; // import the LocalDate class
//import java.time.LocalTime; // import the LocalTime class
//import java.time.LocalDateTime; // import the LocalDateTime class
//public class dates {
//    public static void main(String[] args){
//        LocalDate date = LocalDate.now(); // Create a date object
//        System.out.println(date); // Display the current date
//
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//    }
//}

//Formating date and time
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dates{
    public static void main(String[] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}