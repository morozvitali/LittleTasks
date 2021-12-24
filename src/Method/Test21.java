package Method;

public class Test21 {
    static public int[] multiplication(int[] arrayOne, int[] arrayTwo) {
        if (arrayOne.length < arrayTwo.length) {
            int[] result = new int[arrayTwo.length];
            for (int i = 0; i < arrayOne.length; i++) {
                result[i] = arrayTwo[i] * arrayOne[i];
            }
            return result;
        } else {
            int[] result = new int[arrayOne.length];
            for (int i = 0; i < arrayTwo.length; i++) {
                result[i] = arrayTwo[i] * arrayOne[i];
            }
            return result;
        }
    }
}

class Test21Test {


    public static void main(String[] args) {
        int[] arrayIntOne = {1, 2, 4, 5, 1, 1, 1};
        int[] arrayIntTwo = {3, 2, 4, 6, 3};
        int a[] = Test21.multiplication(arrayIntOne, arrayIntTwo);
        for (int i = 0; i < a.length; i++) {
            System.out.print(arrayIntOne[i]  + " * "  + " = " + a[i]);
            System.out.println();

        }
    }

}

//    принимает два массива интов одинаковых по длинне,
//    возращает массив интов который состоит
//    из перемноженных елементов входящих массивов