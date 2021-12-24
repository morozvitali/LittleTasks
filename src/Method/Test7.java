package Method;
public class Test7 {

    static int calc(int a, int b, int c, int d, int e) {
        int abcBiggest = Test6.calc(a, b, c);
        int abcdeBiggest = Test6.calc(abcBiggest, d, e);
        return abcdeBiggest;
    }
}

class Compare3numbers {
            static int calc(int a, int b, int c) {
                compar(a,b);
                return compar(compar(a,b),c);
            }
            static int compar(int a, int b) {
                return a > b ? a : b;
            }
        }


        class Test7Test {
    public static void main(String[] args) {
        System.out.println("Пример 7");
        System.out.println("Условие: Метод принимает 5 интов, возвращает большее из них");

        int maxNumFromMethod = (Test7.calc(9, 44, 8, 3, 11));
        System.out.println("Большее значение из 5х чисел: " + maxNumFromMethod);

    }
}