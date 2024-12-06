import java.time.LocalDate; // Import the LocalDate class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class TodayDate {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Format the date in a readable format (e.g., "dd-MM-yyyy")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);

        // Print today's date
        System.out.println("Today's date is: zvnkznk.v,znkm,.vkmn,." + formattedDate);
    }

}
