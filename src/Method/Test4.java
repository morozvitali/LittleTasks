package Method;

public class Test4 {
    static int[][] doInvertIntArray (int[][] intArray) {
        for (int a = 0; a < intArray.length; a++) {
            for (int b = 0; b < intArray[a].length; b++) {
                intArray[a][b] = - intArray[a][b];
            }
        }
        return intArray;
    }
}

class Test4Test {
    public static void main(String[] args) {
        System.out.println("Пример 4");
        System.out.println("Условие: принимает 2м массив интов," +
                " ивертирует массив интов " +
                "(каждое значение в передаваемом массиве меняет знак)");

        int[][] intArray = {{1, 3, 4, 5},
                {7, 8, 0},
                {2, 5},
                {8, 6, 7, 2, 3},
                {2, 5, 3}};
        int[][] minArray = Test4.doInvertIntArray(intArray);
 //         Проверим возвращенное значение в массиве:
        for (int y = 0; y < minArray.length; y++) {
            for (int z = 0; z < minArray[y].length; z++) {
                System.out.print(minArray[y][z]);
            }
            System.out.println();
        }
    }
}