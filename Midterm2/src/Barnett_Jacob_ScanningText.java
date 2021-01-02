import java.util.Scanner;
import java.util.StringTokenizer;

public class Barnett_Jacob_ScanningText {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single line of text:");
        String line = input.nextLine();
        int letterCount = 0;
        line = line.toUpperCase();

        for(int i = 0;i < line.length();i++) {
            if (Character.isAlphabetic(line.charAt(i))) {
                letterCount++;
            }
        }

        StringTokenizer s = new StringTokenizer(line," ");
        int tokens = s.countTokens();
        int[] freq = new int[26];

        for(int i = 0;i < line.length();i++) {
            if(Character.isAlphabetic(line.charAt(i))) {
                freq[(int) line.charAt(i) - (int) 'A']++;
            }
        }

        System.out.println("The line contains " + letterCount + " letters." );
        System.out.println("The line contains " + tokens + " string tokens.");
        System.out.println("The frequency of letters is: \n");

        for(int i = 0;i < 26;i++) {
            if (freq[i] != 0) {
                System.out.println((char) (i + 'A') + " -- " + freq[i]);
            }
        }
    }
}