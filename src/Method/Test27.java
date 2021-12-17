package Method;

public class Test27 {
    static int [] sumArrayAction (int [] arrayOne, int [] arrayTwo) {
        int[] sumArray = new int[arrayOne.length + arrayTwo.length];
        int splitKey = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            sumArray[splitKey] = arrayOne[i];
            splitKey++;
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            sumArray[splitKey] = arrayTwo[i];
            splitKey++;
        }
        return sumArray;
    }
}

//
//class Test27Test {
//    public static void main(String[] args) {
//
//        int[] a = Test27.doSplitArray(new int[]{1, 2, 3}, new int[]{5, 6, 7});
//        for (int i=0; i<a.length; i++){
//        System.out.println(a[i]);
//    }
//}}

//    принимает два массива интов, возвращает массив состоящий из всех елементов входящих массивов