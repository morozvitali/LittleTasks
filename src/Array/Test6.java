package Array;
import java.util.Random;

public class Test6 {

    public static void main(String[] args) {

        int[] array = new int[4];
        boolean flag = false;
        Random rand = new Random();

        for (int a = 0; a < 4; a++) {
            array[a] = 10 + rand.nextInt(89);
            System.out.print(array[a] + " ");
            if (a > 0 && array[a - 1] > array[a]) {
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Массив возрастающий");
        }
    }
}
