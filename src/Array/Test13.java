package Array;
import java.util.Random;
public class Test13 {

    public static void main(String[] args) {

        int additionElements = 0;
        int[][][] array = new int[3][4][5];
        Random rand = new Random();

        for (int a = 0; a < array.length; a++) {
            System.out.println(a + "-я часть трехмерного массива");
            for (int b = 0; b < array[a].length; b++) {
                for (int c = 0; c < array[a][b].length; c++) {

                    array[a][b][c] = -10 + rand.nextInt(21);
                    additionElements += array[a][b][c];
                    System.out.print(array[a][b][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println(additionElements + " сумма всех элементов");
    }
}