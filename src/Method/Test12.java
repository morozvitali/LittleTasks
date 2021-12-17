package Method;
public class Test12 {
    static int getFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

class Test12Test {
    public static void main(String[] args) {
        System.out.println("Пример 12");
        System.out.println("Условие: метод принимает инт, и возвращает факториал от заданого инта");

        int a = Test12.getFactorial(3);
        System.out.println("Выведем полученный факториал числа " + a);
    }
}