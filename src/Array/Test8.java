package Array;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {

        int[][] array = new int[8][5];
        Random rand = new Random();
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = 10 + rand.nextInt(90);
                System.out.print(array[a][b] + " ");
            }        System.out.println();
        }

    }
}