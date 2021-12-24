package Method;

public class Test27 {
    static int[] sumArrayAction(int[] arrayOne, int[] arrayTwo) {
        int[] sumArray = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < arrayOne.length; i++) {
            sumArray[i] = arrayOne[i];
        }

        System.arraycopy(arrayTwo, 0, sumArray, arrayOne.length, arrayTwo.length);
        return sumArray;
    }
}


class Test27Test {
    public static void main(String[] args) {

        int[] a = Test27.sumArrayAction(new int[]{1, 2, 3,4,5,6,7,8,9}, new int[]{1,2,3,4,5, 6, 7,8});
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }}
//  принимает два массива интов, возвращает массив состоящий из всех елементов входящих массивов