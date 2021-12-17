package Method;
public class Test8 {
    static String makeString (char[] charArray) {
        String strChar = new String(charArray);
        return strChar;
    }
}


class Test8Test {
    public static void main(String[] args) {
        System.out.println("Пример 8");
        System.out.println("Условие: Метод принимает массив чаров, возвращает строку состоящую из символов массива");

        char[] charArray = {'A', 'B', 'C', 'E', 'a', 'b', 'c', 'd', 'e'};

        String a = Test8.makeString(charArray);
        System.out.println("Выведем полученную строку для проверки " + a);
    }
}