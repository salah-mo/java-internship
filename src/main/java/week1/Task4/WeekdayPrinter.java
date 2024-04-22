package week1.Task4;

public class WeekdayPrinter {
    public void printDay(int weekdayNumber) {
        Day day = switch (weekdayNumber) {
            case 1 -> new Monday();
            case 2 -> new Tuesday();
            case 3 -> new Wednesday();
            case 4 -> new Thursday();
            case 5 -> new Friday();
            case 6 -> new Saturday();
            case 7 -> new Sunday();
            default -> throw new IllegalArgumentException("Invalid weekday number.");
        };
        System.out.println(day.getName());
    }
}