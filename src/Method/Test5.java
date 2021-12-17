package Method;
public class Test5 {
    static int doComparison(int a, int b) {
        return a>b ? a : b;
    }
}

class Test5Test {
    public static void main(String[] args) {
        System.out.println("Пример 5");
        System.out.println("Условие: Метод приминает 2 инта, а и б, возвращает большее их этих 2х чисел");

        int maxNumFromMethod = (Test5.doComparison(9, 5));
        System.out.println("Большее значение из 2х чисел: " + maxNumFromMethod);

    }
}