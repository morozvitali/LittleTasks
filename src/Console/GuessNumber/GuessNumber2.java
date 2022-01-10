package Console.GuessNumber;

import java.util.Scanner;
import java.util.Random;


public class GuessNumber2 {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        System.out.println("Робот загадал число, попробуйте отгадать");

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int robotNumber = rand.nextInt(max);
        System.out.println("подсмотрим число которое загадал робот - для отладки - " + robotNumber);
        int userNumber;

        do {
            System.out.println("Введите число от " + min + " до " + max);
            userNumber = scanner.nextInt();

            if ((userNumber > robotNumber) && (userNumber <= max)) {
                System.out.println("Загаданное число меньше");
                max = userNumber - 1;
            } else if ((userNumber < robotNumber) && (userNumber >= min)) {
                System.out.println("Загаданное число больше");
                min = userNumber + 1;
            } else if (userNumber == robotNumber) {
                System.out.println("Загаданное число " + robotNumber + ". Игра окончена");
            } else {
                System.out.println("Неверно. Нужно вводить числа от " + (min) + " до " + (max));
            }
        } while (userNumber != robotNumber);
    }
}

