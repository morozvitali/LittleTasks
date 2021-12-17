package Array;

import java.util.Random;

public class Test9 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int sum = 0;
        Random rand = new Random();

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = 10 + rand.nextInt(41);
                System.out.print(array[a][b] + " ");
                sum += array[a][b];
            }
            System.out.println(" конец строки");
        }
        System.out.println(sum + " сумма всех элементов массива");
    }
}


