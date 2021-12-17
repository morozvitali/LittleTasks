package Array;
        import java.util.Random;
public class Test3 {
    public static void main(String[] args) {
        int eventCount = 0;
        int[] array = new int[15];
        Random rand = new Random();
        for (int i = 0; i <= array.length; i++) {
            array[i] = rand.nextInt(9);
            if (array[i] % 2 == 0) {
                eventCount++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println(eventCount + " ");
    }
}
