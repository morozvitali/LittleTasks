package Array;

import java.util.Random;

public class Test12 {

    public static void main(String[] args) {

        int[][] array = new int[7][4];
        Random rand = new Random();
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = rand.nextInt(51);
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }

        int maxSubstringIndex = 0;
        int sumSubstringDefault = 0;
        for (int a = 0; a < 7; a++) {

            int sumSubstringCalc = 0;
            for (int b = 0; b < 4; b++) {
                sumSubstringCalc += array [a][b];
            }

            if (sumSubstringCalc > sumSubstringDefault) {
                sumSubstringDefault = sumSubstringCalc;
                maxSubstringIndex = a;
            }
        }
        System.out.println(maxSubstringIndex+" - индекс строки с наибольшей суммой элементов");
    }
}



