package Console.GuessNumber;
import java.util.Scanner; // импорт сканера из библиотеки классов

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введенное число: " + number);
    }}
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

