package Array;
import java.util.Random;
public class Test10 {

    public static void main(String[] args) {

        int[][] array = new int[5][8];
        int maxNumber = -99;
        Random rand = new Random();

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = -99 + rand.nextInt(199);
                System.out.print(array[a][b] + " ");

                if (maxNumber < array[a][b]) {
                    maxNumber = array[a][b];
                }
            }
            System.out.println();
        }
        System.out.println(maxNumber + " максимальный элемент в массиве");
    }
}

