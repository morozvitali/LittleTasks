package Loops;

public class Test9 {
    public static void main(String[] args) {

        System.out.println("Для каждого числа N кратного трем из диапазона 0 .. 10, напечатать это число N раз: ");

        for (int k = 0; k < 10; k += 3) {
            for (int i = 0; (i < k); i++) {
                System.out.print(k + " ");
            }
        }
    }
}



//package test;
//
//public class Test9 {
//    public static void main(String[] args) {
//
//        int k = 3;
//        for (int i = 0; (i <= k); i++) {
//            if (i > 0) {
//                System.out.print(k + " ");
//            }
//
//            if (i == k && k < 9) {
//                k += 3;
//                i = 0;
//            }
//        }
//    }
//}