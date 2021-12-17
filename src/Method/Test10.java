package Method;
public class Test10 {
    static int retIndexOfNumber(int[] array, int numberForSearch) {
        for (int i=0;i< array.length; i++) {
            if (array[i] == numberForSearch) {
                return i;
            }
        }
        return -1;
    }
}

class Test10Test {
    public static void main(String[] args) {
        System.out.println("Пример 10");
        System.out.println("Условие: Метод принимает массив интов, и значение типа инт," +
                " возвращает индекс массива в котором" +
                " значение совпадает с передаваемым, начиная с начала массива." +
                " Если значения в массиве нет возвращает -1");

        int [] intArray = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
        int someInt = 9;

        int a = Test10.retIndexOfNumber(intArray, someInt);
        System.out.println("Выведем полученный индекс со значением " + a);
    }
}