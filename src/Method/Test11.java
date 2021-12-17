package Method;
//1. Опять же есть метод длины массива
//2. Ты можешь минимальное например, присвоить не 5, как ты делаешь.
//А например первый елемент в строке и от него потом плясать.
// число 5 ты чисто знаешь, из-за диапазона.




public class Test11 {
    static int retIndexOfNumber(int[] array, int numberForSearch) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == numberForSearch) {
                return i;
            }
        }
        return -1;
    }
}

class Test11Test {
    public static void main(String[] args) {
        System.out.println("Пример 11");
        System.out.println("Условие: принимает массив интов, и значение типа инт, " +
                "возвращает индекс массива в котором значение совпадает с передаваемым, " +
                "начиная с конца массива. Если значения в массиве нет возвращает -1");

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int someInt = 100;

        int a = Test11.retIndexOfNumber(intArray, someInt);
        System.out.println("Выведем полученный индекс начиная с конца массива со значением " + a);
    }
}