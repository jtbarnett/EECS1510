import java.util.Scanner;

public class Barnett_Jacob_definiteIntegral {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("We will be calculating the definite integral fo the function f(x) = x^3 using the trapezoidal rule");
        System.out.println("Enter the first point, second point, and number of intervals of the definite integral all separated by spaces: ");
        double x0 = input.nextDouble();
        double x1 = input.nextDouble();
        int intervals = input.nextInt();

        System.out.println("The value of the definite integral is: " + Math.round(trapezoidalRule(x0, x1, intervals) * 10000.0) / 10000.0);
    }

    public static double trapezoidalRule(double a, double b, int n) {

        double h = (b - a) / n;
        double sum = functionValue(a) + functionValue(b);

        for(int i = 1; i < n; i++) {
            sum += 2 * functionValue(a + i * h);
        }

        return (h / 2) * sum;
    }

    public static double functionValue(double x) {

        return x*x*x;
    }
}