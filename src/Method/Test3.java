package Method;

public class Test3 {

    static char[][] doReturn(int[][] intArray) {
        int intArrayLengthRows = intArray.length;
        int intArrayLengthColumns = intArray[0].length;
        char[][] charArray = new char[intArrayLengthRows][intArrayLengthColumns];

        for (int a = 0; a < charArray.length; a++) {
            for (int b = 0; b < charArray[0].length; b++) {
                charArray[a][b] = (char) intArray[a][b];

                System.out.print(charArray[a][b]);
            }
            System.out.println();
        }
        return charArray;
    }
}

    class Test3Test {
        public static void main(String[] args) {
            System.out.println("Пример 3");
            System.out.println("Условие: Метод принимает 2м массив интов," +
                    "возвращает 2мерный массив чаров," +
                    "каждый символ в позиции массива " +
                    "соответствует коду символа передаваемого инта");

            int[][] intArray = {{112, 113, 114, 115},
                    {117, 118, 119, 120},
                    {212, 253, 245, 525}};
            Test3.doReturn(intArray);
        }
    }