package Method;

public class Test17 {
    static void sort(int[] array) {
        int temp;
        for (int a = 0; a <= array.length-2; a++) {
            if (array[a] > array[a + 1]) {

                for (int i = a; 0 <= i; i--) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    if (i > 0 && array[i] < array[i - 1]) {
                        continue;
                    }
                    break;

                }
            }
        }
    }
}

class Test17Test {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 5, 8, 6, 72, 0, 44, 22, 55, 1, 66, 1, 4, 3, 2, 5, 32};
        Test17.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}