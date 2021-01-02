import java.util.Scanner;

public class Barnett_Jacob_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        System.out.println("The reverse of the string you entered is: " + reverseString(word));
    }

    public static String reverseString(String methodString) {

        int stringLength = methodString.length();
        char[] newWord = new char[stringLength];
        for(int i = 0; i < methodString.length(); i++) {
            newWord[--stringLength] = methodString.charAt(i);
        }
        return new String(newWord);
    }
}