package Method;
public class Test6 {

    static int calc(int a, int b, int c) {
        compar(a,b);
        return compar(compar(a,b),c);
    }
    static int compar(int a, int b) {
        return a > b ? a : b;
    }
}




    class Test6Test {

    public static void main(String[] args) {
        System.out.println("Пример 6");
        System.out.println("Условие: Метод принимает 3 инта, возвращает большее из них");

        int maxNumFromMethod = (Test6.calc(9,15, 15));
        System.out.println("Большее значение из 3х чисел: " + maxNumFromMethod);

    }
}
