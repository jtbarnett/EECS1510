import java.util.Scanner;

public class Barnett_Jacob_1 {

    public static void main(String[] args) {

        System.out.println("Enter a sequence of integers, characters, and strings separated by spaces:");
        Scanner input = new Scanner(System.in);
        String inputSeq = input.nextLine();
        inputSeq = inputSeq.trim();

        if (inputSeq.length() > 0) {

            int start = 0;
            int end = inputSeq.indexOf(' ');
            String last = inputSeq.substring(start, end);
            String current = last;
            int count = 1;
            String outputSeq = "";

            do {

                start = end + 1;
                end = inputSeq.indexOf(' ', start);

                if (end == -1) {
                    end = inputSeq.length();
                }

                current = inputSeq.substring(start, end);

                if (current.equals(last)) {
                    count++;
                } else {
                    outputSeq = outputSeq + last + ' ' + count + ' ';
                    last = current;
                    count = 1;
                }
            } while (end < inputSeq.length());

            outputSeq = outputSeq + last + ' ' + count + ' ';
            System.out.println("Run length encoder output:");
            System.out.println(outputSeq);
        }
    }
}
