package Array;
import java.util.Random;
public class Test4 {

    public static void main(String[] args) {
        int[] array = new int[8];
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            array[i] = 1 + rand.nextInt(10);
                System.out.print(array[i] + " ");
        }
                System.out.println();

        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
                System.out.print(array[i] + " ");
        }
                System.out.println();
    }
}