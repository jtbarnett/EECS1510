import java.util.Scanner;

public class Barnett_Jacob_ValidPhoneNumbers {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a phone number of the form ddd-ddd-dddd:");
        String s = input.nextLine();
        PhoneNumber(s);
    }

    public static void PhoneNumber(String user) {

        boolean isValid = (user.length() == 12) && (Character.isDigit(user.charAt(0))) && (Character.isDigit(user.charAt(1))) && (Character.isDigit(user.charAt(2))) && (user.charAt(3) == '-') && (Character.isDigit(user.charAt(4))) && (Character.isDigit(user.charAt(5))) && (Character.isDigit(user.charAt(6))) && (user.charAt(7) == '-') && (Character.isDigit(user.charAt(8))) && (Character.isDigit(user.charAt(9))) && (Character.isDigit(user.charAt(10))) && (Character.isDigit(user.charAt(11)));
        System.out.println(user + " is " + ((isValid) ? "a valid " : "an invalid ") + "phone number.");
    }
}