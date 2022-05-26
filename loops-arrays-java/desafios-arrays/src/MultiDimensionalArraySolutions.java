import java.util.Arrays;
import java.util.Random;

public class MultiDimensionalArraySolutions {
    public static void matrix() {
        Random random = new Random();
        int[][] m = new int[4][4];
        int smallestNumber = 0;
        int smallestNumberRow = 0;
        int smallestNumberColumn = 0;

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                int randomNumber = random.nextInt(10);
                m[row][column] = randomNumber;
                if ((row == 0 && column == 0) || randomNumber < smallestNumber) {
                    smallestNumber = randomNumber;
                    smallestNumberRow = row;
                    smallestNumberColumn = column;
                }
            }
            System.out.println(Arrays.toString(m[row]));
        }

        System.out.println("Menor número da matriz: " + smallestNumber);
        System.out.println("Linha: " + smallestNumberRow);
        System.out.println("Coluna: " + smallestNumberColumn);
    }
}
