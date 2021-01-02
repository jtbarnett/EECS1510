import java.util.Scanner;

public class Barnett_Jacob_BinaryConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 1;

        while(count > 0) {

            System.out.print("Enter a binary number: ");
            String binary = input.nextLine();
            int value = binaryToDecimal(binary);

            if(value == -1) {
                System.exit(0);
            } else {
                System.out.print("Conversion to decimal: " + value + "\n");
                count++;
            }
        }
    }

    public static int binaryToDecimal(String binaryString) {

        int binaryNumber = Integer.parseInt(binaryString);

        if(binaryNumber == -1) {
            return binaryNumber;
        } else {
            String convertString =  Integer.toString(binaryNumber);
            int toDecimal = Integer.parseInt(convertString, 2);
            return toDecimal;
        }
    }
}