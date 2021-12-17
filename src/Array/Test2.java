package Array;

public class Test2 {
    public static void main(String[] args) {
        int quantityElements = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                quantityElements++;
            }
        }
        int[] array = new int[quantityElements];
        int arrayIndex = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                array[arrayIndex] = i;
                System.out.print(array[arrayIndex] + " ");
                arrayIndex++;
            }
        }
    }
}

//    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран
//
//    где собственно массив? перечитай задание.
//        Нужно вернуть массив из всех нечетных чисел
//
//1. Пробежаться в цикле от 2 до 20
//        2. Найти четные числа и посчитать их кол-во
//        3. Проверку на 0
//        4. Создать массив с этим кол-вом
//        5. Пробежаться в цикле от 2 до 20
//        6. Найти четные числа и положить в массив
//        7. Заполнить его кратными числами"
//
//        кратность %2 == 0 , никаких делений чисел не юзаем для кратности