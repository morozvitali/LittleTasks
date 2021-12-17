package Array;
import java.util.Random;
public class Test7 {
    public static void main(String[] args) {
        int maxNumberOfArray = -15;
        int[] array = new int[12];

        Random rand = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = -15 + rand.nextInt(31);

            if (maxNumberOfArray < array[a]) {
                maxNumberOfArray = array[a];
            }
        }
        System.out.println(maxNumberOfArray + " - максимальное число из массива array");
    }
}
