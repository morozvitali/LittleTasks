package Method;
public class Test13 {
    public static boolean highYearCalculate (int year) {
        boolean highYear = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            highYear = true;
        }
        return highYear;
    }
}


class Test13Test {
    public static void main(String[] args) {
        System.out.println("Пример 13");
        System.out.println("Условие: принимает инт год, и возвращает тру если год высокосный");

        int someInt = 2000;
        boolean a = Test13.highYearCalculate(someInt);
        System.out.println("Вывод тру/фолс если " + someInt + " високосный " + a);
    }
}