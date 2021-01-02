import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantityDesired;
        int unitPrice;

        System.out.print("Please enter the Quantity desired: ");
        quantityDesired = input.nextInt();

        System.out.print("Please enter the Unit price: ");
        unitPrice = input.nextInt();

        System.out.println("\nThe Quantity desired is : " + quantityDesired);
        System.out.println("The Unit Price is       : $" + unitPrice);
        System.out.println("The Total Amount is     : $" + quantityDesired*unitPrice);
    }
}