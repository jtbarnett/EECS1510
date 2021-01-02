public class Barnett_Jacob_maxVal {

    public static int[] maxValPos(int[][] data) {

        int maxRow = 0, maxCol = 0, maxVal = data[maxRow][maxCol];

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (data[row][col] > maxVal) {
                    maxVal = data[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        int[] retArray = {maxVal, maxRow, maxCol};
        return retArray;
    }
}
// The 5 errors I found were:
// 1) I added the [] in front of the int in the method statement
// 2) I moved the declaration of the int variables outside of the for loop
// 3) I changed data.length in the column for loop to data[row].length
// 4) I changed the < to > in the if loop statement condition
// 5) I declared the variable retArray for returning the final array, there was
//    no declaration of a variable before that