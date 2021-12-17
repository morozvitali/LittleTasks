package Method;
public class Test16 {
    static void round (double doubleNumber) {
        System.out.printf("%.3f", doubleNumber);
    }
}



class Test16Test {

    public static void main(String[] args) {
        System.out.println("Пример 16");
        System.out.println("Условие: Метод метод приминает дабл," +
                "выводит на екран этот дабл с точностью не больше чем 3 знака после точки");

        double someDouble = 3.3333333;

        Test16.round (someDouble);
    }
}