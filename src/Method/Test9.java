package Method;
public class Test9 {
    public static boolean doArrayComparison (char[] charArrayFirst, char[] charArraySecond) {
        boolean resultComparison = true;
        for (int i = 0; i < charArrayFirst.length; i++) {
            if (charArrayFirst[i] != charArraySecond[i]) {
                resultComparison = false;
                break;
            }
        }
        return resultComparison;
    }
}

class Test9Test {
    public static void main(String[] args) {
        System.out.println("Пример 9");
        System.out.println("Условие: Метод принимает 2 массива чаров, проверяет есть ли в 1 массиве, " +
                "такая же последовательность символов которую представляет собой второй массив. Возвращает булеан");

        char[] charArrayA = {'A', 'B', 'C', 'D'};
        char[] charArrayB = {'A', 'B', 'C', 'D'};

        boolean a = Test9.doArrayComparison(charArrayA, charArrayB);
        System.out.println("Та же последовательность символов: " + a);
    }
}