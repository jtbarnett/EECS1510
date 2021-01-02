import java.util.Scanner;

public class Barnett_Jacob_parsingTimes {

    public static void main(String[] args) {

        System.out.print("Enter the time in the format hours:minutes AM/PM, e.g. 7:06 PM\n> ");

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String type = "";
        try {
            type = input.split(" ")[1];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid time format");
            System.exit(0);
        }

        int hours = 0;
        try {
            hours = Integer.parseInt(input.split(":")[0]);
        } catch(NumberFormatException e) {
            System.out.println("Invalid time format");
            System.exit(0);
        }

        int minutes = 0;
        try {
            minutes = Integer.parseInt(input.split(" ")[0].split(":")[1]);
        } catch(NumberFormatException e) {
            System.out.println("Invalid time format");
            System.exit(0);
        }

        if(type.equalsIgnoreCase("am") || type.equalsIgnoreCase("pm")) {
            if (minutes > 59) {
                System.out.println("Invalid time format");
                System.exit(0);
            } else if (minutes >= 0) {
                if (hours > 12) {
                    System.out.println("Invalid time format");
                    System.exit(0);
                } else if (hours > 0) {
                    if (type.equalsIgnoreCase("pm")) {
                        if (hours < 12) {
                            hours += 12;
                        }
                    } else {
                        if (hours == 12) {
                            hours = 0;
                        }
                    }
                } else {
                    System.out.println("Invalid time format");
                    System.exit(0);
                }
            } else {
                System.out.println("Invalid time format");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid time format");
            System.exit(0);
        }

        double min = (double) minutes;
        double newMinutes = min/60;
        double newHours = (double) hours;
        double newTime = newHours + newMinutes;

        System.out.printf("%.2f hours have elapsed from the start of the day", newTime);
        System.out.println();
    }
}