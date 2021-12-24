package Array;
import java.util.Random;

public class Test11 {
    static int minNumber;
    public static void main(String[] args) {

        int[][] array = new int[7][4];
        Random rand = new Random();

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[0].length; b++) {
                array[a][b] = -5 + rand.nextInt(11);
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }

        for (int a = 0; a < array.length; a++) {
            minNumber = array [a][0];
            for (int b = 0; b < 4; b++) {
                if (minNumber > array [a][b]) {
                        minNumber = array[a][b];
                }
            }
            System.out.println("Минимальное число " + a + "-й строки: " + minNumber);
        }
    }
}
