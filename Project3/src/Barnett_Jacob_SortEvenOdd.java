import java.util.Arrays;

public class Barnett_Jacob_SortEvenOdd {

    public static void main(String[] args) {

        int[] mixedArray = {8, 9, 0, 5, 6, 1};
        System.out.println("The mixed array is " + Arrays.toString(mixedArray));
        sortEvenOdd(mixedArray, mixedArray.length);
        System.out.println("The sorted array is: " + Arrays.toString(mixedArray));
    }

    public static int[] sortEvenOdd(int[] mixed, int length) {

        int l = 0, r = length - 1;
        int count = 0;

        while(l < r) {

            while(mixed[l] % 2 == 0) {
                l++;
                count++;
            }
            while(mixed[r] % 2 != 0 && l < r) {
                r--;
            }
            if(l < r) {
                int newNum = mixed[l];
                mixed[l] = mixed[r];
                mixed[r] = newNum;
            }
        }
        Arrays.sort(mixed, 0, count);
        Arrays.sort(mixed, count, length);
        return(mixed);
    }
}