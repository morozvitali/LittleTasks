package Method;

public class Test20 {

    public static boolean searchByte(byte[] byteArray) {
        for (int i = 0; i < byteArray.length; i++) {
            for (int a = i+1; a < byteArray.length; a++) {
                if (byteArray[i] == byteArray[a]) {
                    return true;
                }
            }
        }
        return false;
    }
}

class Test20Test {
        public static void main(String[] args) {

            System.out.println("Пример 20");
            System.out.println("Условие: Метод принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру");

            byte[] array = {1, 3, 4, 5, 2, 9, 6};
            System.out.println(Test20.searchByte(array));
        }
    }
