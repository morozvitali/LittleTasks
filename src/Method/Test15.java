package Method;
public class Test15 {
    static void print (int number, int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % number == 0) {
                System.out.print(intArray[i] + " ");
            }
        }
    }
}

class Test15Test {

public static void main(String[]args){
        System.out.println("Пример 15");
        System.out.println("Условие: Метод приминает массив интов и число,"+
        "выводит на екран только елементы массива которые кратны этому числу");

        int someInt=2;
        int[]intArray={2,3,4,5,6,7,8,9};

        Test15.print (someInt,intArray);
        }
        }