package Loops;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("Вывод чисел от 0 до 100 кратных 2 и 3, или чисел больше 50 и меньше 70 из 100");
        for (int i = 0; i <= 100; i++) {
            if ((i > 50) && (i < 70) || ((i % 2) == 0) && ((i % 3) == 0)){
                System.out.print(i + " ");
            }
        }
    }
}