package Array;

import java.util.Random;

public class Test5 {

    public static void main(String[] args) {

        int additionOne = 0;
        int additionTwo = 0;
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        Random rand = new Random();
        for (int a = 0; a < firstArray.length; a++) {

            firstArray[a] = rand.nextInt(6);
            additionOne += firstArray[a];

            secondArray[a] = rand.nextInt(6);
            additionTwo += secondArray[a];
        }

        for (int a = 0; a < firstArray.length; a++) {
            System.out.print(firstArray[a] + " ");
        }
        System.out.println();

        for (int a = 0; a < secondArray.length; a++) {
            System.out.print(secondArray[a] + " ");
        }
        System.out.println();

        additionOne= additionOne / firstArray.length;
        additionTwo = additionTwo / firstArray.length;
        if (additionOne > additionTwo) {
            System.out.println("Первый массив больше " + additionOne);
        } else if (additionOne < additionTwo) {
            System.out.println("Второй массив больше " + additionTwo);
        } else
            System.out.println("Значения в массивах равны: " + additionOne);
    }
}


//    цикл до 5 и когда находишь среднее арифметическое, деление на 5 .
//        вроде ж есть специальный метод, что ты можешь узнать размер массива,
//        везде тоже исправить
//
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).