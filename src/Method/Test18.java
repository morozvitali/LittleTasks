package Method;

public class Test18 {
    static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                int tempIntData = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tempIntData;
                i = 0;
            }
        }
    }
}

class Test18Test {
    public static void main(String[] args) {
        System.out.println("Пример 18");
        System.out.println("Условие: метод принимает массив интов сортирует его по убыванию");

        int[] array = {5, -4, 2, -6, 8, -2, 2, 3, 4, 2, 5, -1, 6, -1, 2, -3, 2, 1, 0};
        Test18.sortArray(array);
        for (int i=0;i<array.length; i++) {
            System.out.print(array[i]+" ");
        }


    }
}