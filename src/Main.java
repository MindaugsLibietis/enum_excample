import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi nedēļas dienu: ");
        String dayValue = sc.nextLine();
        sc.close();
        Day diena = Day.getDayLV(dayValue.toUpperCase());
        if (diena == null) {
            Day day = Day.valueOf(dayValue.toUpperCase());
            switch (day) {
                case MONDAY:
                    System.out.println("Nedeļas sākums");
                    break;
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                    System.out.println("Nedēļas vidus");
                    break;
                case FRIDAY:
                    System.out.println("Pēdējā nedēļas darba diena");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Nedēļas nogale");
                    break;
            }
        } else {
            switch (diena) {
                case MONDAY:
                    System.out.println("Nedeļas sākums");
                    break;
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                    System.out.println("Nedēļas vidus");
                    break;
                case FRIDAY:
                    System.out.println("Pēdējā nedēļas darba diena");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Nedēļas nogale");
                    break;
            }
        }

    }
}
