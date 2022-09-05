import java.util.Scanner;

public class Main {
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

    private static void listOverNDays(int i) {
        
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
