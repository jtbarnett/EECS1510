import java.text.DecimalFormat;
import java.util.Scanner;

public class Barnett_Jacob {

    public static void main(String[] args){

        modulo();
        pi();
        chill();
        distance();
        upper();
        inCircle();
        guesses();
        taxes();
    }

    public static void modulo() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int threeDigit = input.nextInt();
        int sum = 0;
        int number = threeDigit;

        while(number > 0) {
            int finalDigit = number % 10;
            sum += finalDigit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
        System.out.println();
    }

    public static void distance() {

        Scanner input = new Scanner(System.in);

        double[] pointOne = new double[2];
        double[] pointTwo = new double[2];

        System.out.print("Enter x1 and y1: ");
        pointOne[0] = input.nextDouble();
        pointOne[1] = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        pointTwo[0] = input.nextDouble();
        pointTwo[1] = input.nextDouble();

        double dis = Math.sqrt(Math.pow(pointTwo[0] - pointOne[0], 2) + (Math.pow(pointTwo[1] - pointOne[1], 2)));

        System.out.println("The distance is " + (float) dis);
        System.out.println();
    }

    public static void pi() {

        Scanner input = new Scanner(System.in);

        System.out.println("Pi is approximated by the following formula: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - ...)");
        System.out.println("We will be calculating a smaller version of the formula as: 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)");
        System.out.println();
        System.out.print("Enter 1 to view the result of the formula: ");
        int actNum = input.nextInt();

        while(actNum <= 1) {

            double piApp = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));

            System.out.println("The result of the Pi approximation formula is: " + piApp);
            actNum++;
        }
        System.out.println();
    }

    public static void chill(){

        Scanner input = new Scanner(System.in);

        int loop = 1;
        double value;

        while(loop == 1) {

            System.out.print("Enter temperature (Fahrenheit): ");
            double temp = input.nextDouble();
            System.out.print("Enter wind speed (mph): ");
            double windSpeed = input.nextDouble();

            if(temp <= 41 && temp >= -58 && windSpeed >= 2) {

                value = (35.74 + (0.6215*temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16)));

                System.out.println("The wind chill index is " + (int) value);
                System.out.println();
                loop++;
            } else{

                System.out.println("The values you entered are not valid, please try again.");
                System.out.println();
            }
        }
    }

    public static void upper(){

        Scanner input = new Scanner(System.in);

        int loop = 1;

        while(loop == 1) {

            System.out.print("Enter a letter: ");
            String lowerLet = input.nextLine();

            if (lowerLet.matches("[A-Z, a-z]")) {

                String upperLet = lowerLet.toUpperCase();

                System.out.println("The uppercase equivalent of " + lowerLet + " is " + upperLet);
                System.out.println();
                loop++;
            } else {

                System.out.println("Not a letter.");
                System.out.println();
            }
        }
    }

    public static void inCircle(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(Math.pow(x * x + y * y, 0.5) <= 10.0) {

            System.out.println("Point (" + x + ", " + y + ") is in the circle.");
            System.out.println();
        } else {

            System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
            System.out.println();
        }
    }

    public static void guesses(){

        Scanner input = new Scanner(System.in);

        int secretCode = 22;

        System.out.println("Welcome to People's Bank.");
        System.out.print("Please enter your secret code: ");
        int codeOne = input.nextInt();

        if(codeOne == secretCode) {

            System.out.println("Fine, go ahead.");
            System.out.println();
            return;
        } else {

            System.out.print("Sorry, that is not it. Try again: ");
        }

        int codeTwo = input.nextInt();

        if(codeTwo == secretCode) {

            System.out.println("Fine, go ahead.");
            System.out.println();
            return;
        } else {

            System.out.print("Sorry, last chance. Try again: ");
        }

        int codeThree = input.nextInt();

        if(codeThree == secretCode) {

            System.out.println("Fine, go ahead.");
            System.out.println();
        } else {

            System.out.println("Attempts expired.");
            System.out.println();
        }
    }

    public static void taxes(){

        Scanner input = new Scanner(System.in);

        DecimalFormat decimal = new DecimalFormat("$###,###.##");

        System.out.print("Enter your net taxable income: ");
        int income = input.nextInt();

        if(income >= 0 && income < 9325) {

            double taxOne = .1 * income;

            System.out.println("Your 2014 tas is " + decimal.format(taxOne));
            System.out.println();
        } else if(income >= 9325 && income < 37950) {

            double taxTwo = (.1 * 9325) + (.15 * (income - 9325));

            System.out.println("Your 2014 tax is " + decimal.format(taxTwo));
            System.out.println();
        } else if(income >=37950 && income < 91900) {

            double taxThree = (.1 * 9325) + (.25 * (income - 9325));

            System.out.println("Your 2014 tax is " + decimal.format(taxThree));
            System.out.println();
        } else if(income >=91900 && income < 191650) {

            double taxFour = (.1 * 9325) + (.28 * (income - 9325));

            System.out.println("Your 2014 tax is " + decimal.format(taxFour));
            System.out.println();
        } else if(income >= 191650 && income < 416700) {

            double taxFive = (.1 * 9325) + (.33 * (income - 9325));

            System.out.println("Your 2014 tax is " + decimal.format(taxFive));
            System.out.println();
        } else if(income >= 416700 && income < 418400) {

            double taxSix = (.1 * 9325) + (.35 * (income - 9325));

            System.out.println("Your 2014 tax is " + decimal.format(taxSix));
            System.out.println();
        } else if(income >= 418400) {

            double taxSeven = (.1 * 9325) + (.396 * (income - 9325));

            System.out.println("Your 2014 tax is " + decimal.format(taxSeven));
            System.out.println();
        } else {

            System.out.println("The net income you entered is invalid.");
            System.out.println();
        }
    }
}