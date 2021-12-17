package Method;
public class Test21 {
    static public int[] multiplication(int[] arrayOne, int[] arrayTwo) {
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] *= arrayTwo[i];
        }
        return arrayOne;
    }
}


class Test21Test {


    public static void main(String[] args) {
        int[] arrayIntOne = {1, 2, 4, 5, 7, 8};
        int[] arrayIntTwo = {3, 2, 4, 6, 3, 1};
        int a[] = Test21.multiplication(arrayIntOne, arrayIntTwo);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

//    принимает два массива интов одинаковых по длинне,
//    возращает массив интов который состоит
//    из перемноженных елементов входящих массивов