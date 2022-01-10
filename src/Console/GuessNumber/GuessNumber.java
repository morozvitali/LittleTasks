package Console.GuessNumber;

import java.util.Scanner; // импорт сканера из библиотеки классов
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        System.out.println("Загадайте число");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        Random rand = new Random();
        int robotAnswer;

        do {
            robotAnswer = min + rand.nextInt(max - min);
            System.out.println(robotAnswer + " - предположенное роботом число");
            System.out.println("Минимум " + min);
            System.out.println("Максимум " + max);
            System.out.println("Загаданное Вами число: больше или меньше или равно " + robotAnswer + "?");
            String userAnswer = scanner.next();

            if (userAnswer.equals("больше")) {
                min = robotAnswer + 1;
            } else if (userAnswer.equals("меньше")) {
                max = robotAnswer - 1;
            } else if (userAnswer.equals("равно")) {
                System.out.println("Загаданное число " + robotAnswer + ". Игра окончена");
            } else {
                System.out.println("Нужно вводить больше или меньше или равно, попробуем еще раз");
            }
        } while (userNumber != robotAnswer);
    }
}