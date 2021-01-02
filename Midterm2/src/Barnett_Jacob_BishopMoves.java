public class Barnett_Jacob_BishopMoves {

    public static int numBishopMoves(String square) {

        String upperCase = square.toUpperCase();

        int col = upperCase.charAt(0) - 64;
        int row = upperCase.charAt(1) - 48;

        int numMoves = 0;
        for (int newCol = 1; newCol <= 8; newCol++) {
            int offset = Math.abs(col - newCol);

            int newRowAbove = row + offset;
            if (newRowAbove >= 1 && newRowAbove <= 8 && offset != 0) {
                numMoves++;
                System.out.println((char) (newCol+64) + "" + (char) (newRowAbove+48));
            }

            int newRowBelow = row - offset;
            if (newRowBelow >= 1 && newRowBelow <= 8 && offset != 0) {
                numMoves++;
                System.out.println((char) (newCol+64) + "" + (char) (newRowBelow+48));
            }
        }

        return numMoves;
    }
}