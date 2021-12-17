package Method;

public class Test7 {


    static int doCalcComparison(int a, int b, int c, int d, int e) {
        int compareResult = doCompare(a, b);
        compareResult = doCompare(compareResult, c);
        compareResult = doCompare(compareResult, d);
        return doCompare(compareResult, e);
    }

    static int doCompare(int a, int b) {
        return a > b ? a : b;
    }
}

class Test7Test {
    public static void main(String[] args) {
        System.out.println("Пример 7");
        System.out.println("Условие: Метод принимает 5 интов, возвращает большее из них");

        int maxNumFromMethod = (Test7.doCalcComparison(3, 4, 8, 3, 1));
        System.out.println("Большее значение из 5х чисел: " + maxNumFromMethod);

    }
}