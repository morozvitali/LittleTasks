package Method;

public class Test19 {
    static void sortArray(int[] array, boolean flagUpDown) {
        for (int i = 1; i < array.length; i++) {
            boolean reversArrayFlag;

            if (flagUpDown)
            {reversArrayFlag = (array[i] < array[i - 1]);}
               else {reversArrayFlag = array[i] > array[i - 1];}

            if (reversArrayFlag) {
                int tempIntData = array[i - 1];
                array[i - 1] = array[i];
                array[i] = tempIntData;
                i = 0;
            }
        }
    }
}

class Test19Test {
    public static void main(String[] args) {
        System.out.println("Пример 19");
        System.out.println("Условие: метод принимает массив интов сортирует его по убыванию");

        int[] array = {3, 1, 9, 2, -5, 5, -4, 2};
        Test19.sortArray(array, true);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}