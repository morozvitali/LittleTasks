package Console.GuessNumber;

import java.util.Scanner; // импорт сканера из библиотеки классов
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        //опр мин и макс для поиска
        //min - нижний предел
        //max - верхний предел
        int min = 0;
        int max = 10;
        //опр случайное число
        System.out.println("Загадайте число");//задаем вопрос
        Scanner scanner = new Scanner(System.in); // загадали число (ввести в консоль)
        int userNumber = scanner.nextInt(); // присвоили заданное число userNumber
        Random rand = new Random();// создаем обьект случайных чисел
        int robotAnswer;//тут будут храниться варианты ответов робота
        do {
            robotAnswer = min + rand.nextInt(max); // робот придумал число между мин - макс
            System.out.println(robotAnswer + " - загадано роботом число"); // для проверки выведем его на экран, отладка
//        int robotAnswer = 100;



            System.out.println("Введите ответ, загаданное Вами число: больше или меньше " + robotAnswer + "?"); // спросили больше меньше

            String userAnswer = scanner.next(); // тут ответ больше или меньше
            if (userAnswer.equals("больше")) {
                min = robotAnswer;
            } else {
                max = robotAnswer;
            }
        }while (userNumber != robotAnswer);
    }
}
//// "Console game ""Guess number""
////Игра1:
////Пользователь загадывает число от 1 до 100, компьютер должен его угадать.
////Компьютер делает предположения, пользователь отвечает Больше либо Меньше.
////Когда компьютер угадывает - игра заканчивается.
//
//
//    программа відает случайное compNumber от 1 до 100
//
//    {
//        if (compNumber != userNumber)
//        {
//            Новій запрос в терминал и ввести больше или меньше
//        }
//            Метод SCANER (ввести больше или меньше чем compNumber)
//            Переменная (предел уменьшается, становится больше или меньше в зависимости от ответа(ввода пользователем))
//            if (compNumber > userNumber) {
//
//    else {
//        System.out.println("Write number, game ended");
//        }
//}
//
//
//
//

