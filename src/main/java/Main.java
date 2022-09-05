import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.*;

public class Main {
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);

    static List<Event> events = new ArrayList<>(){{
        add(new Event("Event1", LocalDateTime.parse("01-02-2020 11:33:17",dateTimeFormatter), LocalDateTime.parse("03-02-2020 11:33:17",dateTimeFormatter)));
        add(new Event("Event2", LocalDateTime.parse("01-02-2020 11:33:17",dateTimeFormatter), LocalDateTime.parse("07-02-2020 11:33:17",dateTimeFormatter)));
        add(new Event("Event3", LocalDateTime.parse("01-02-2020 11:33:17",dateTimeFormatter), LocalDateTime.parse("02-02-2020 11:33:17",dateTimeFormatter)));
    }};
    public static void main(String[] args) {
        int choice;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            printMenu();
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add an event");
                    addAnEvent();
                    break;
                case 2:
                    System.out.println("List events longer than 2 days");
                    listOverNDays(2);
                    break;
                case 3:
                    System.out.println("List events starting today");
                    listEventsStartAtGivenDay("2022-09-05");
                    break;
                case 4:
                    System.out.println("Quit");
                    exit = true;
                    break;
                default:
                    System.out.println("Not a valid menu input");
            }
        } while (!exit);
    }

    private static void listEventsStartAtGivenDay(String s) {
    }

    private static void listOverNDays(int days) {
        for (int i = 0; i < events.size(); i++) {
             Event currentEvent = events.get(i);
             LocalDateTime startDate = currentEvent.getStartTime();
             LocalDateTime endDate = currentEvent.getEndTime();
             if (DAYS.between(startDate, endDate) >= days) {
                 System.out.println(currentEvent.getName());
             }
        }
    }
    

    private static void addAnEvent() {
        
    }

    private static void printMenu() {
        System.out.println("1 - Add new event");
        System.out.println("2 - List events which are two days long");
        System.out.println("3 - List events starting today");
        System.out.println("4 - Exit");
    }
}
