import java.util.Scanner;

public class Barnett_Jacob_PiecewiseFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start and end values for x: ");
        double xStart = input.nextDouble();
        double xEnd = input.nextDouble();

        System.out.println("Enter the start and end values for y: ");
        double yStart = input.nextDouble();
        double yEnd = input.nextDouble();
        System.out.println("x\ty\tf(x,y)");

        int xS = (int)xStart;
        int xE = (int)xEnd;
        int yS = (int)yStart;
        int yE = (int)yEnd;
        int xValue = (Math.abs(xE - xS) + 1);
        int yValue = (Math.abs(yE - yS) + 1);
        int total = xValue*yValue;
        int cycle = 1;
        int greaterNum;

        if(xValue > yValue) {
            greaterNum = xValue;
        } else {
            greaterNum = yValue;
        }

        while(greaterNum*greaterNum >= greaterNum*cycle) {
            int startY = yS;
            for(int count = 0; count <= greaterNum; count++) {
                if(startY <= yE && xS <= xE) {
                    int value = functionMethod(xS, startY);
                    String x = Integer.toString(xS);
                    String y = Integer.toString(startY);
                    String f = Integer.toString(value);
                    System.out.println(x + '\t' + y + '\t' + f);
                    startY++;
                }
            }
            cycle++;
            xS++;
        }
    }

    public static int functionMethod(int a, int b) {
        int value;
        if(a >= 0 && b >= 0) {
            value = a + b;
            return(value);
        } else if(a >= 0 && b < 0) {
            value = a + (b*b);
            return(value);
        } else if(a < 0 && b >=0) {
            value = (a*a) + b;
            return(value);
        } else {
            value = (a*a) + (b*b);
            return(value);
        }
    }
}