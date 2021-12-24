package Method;
import java.util.Random;

public class Test24 {
    static int [] createArray (int size, int min, int max) {
        Random rand = new Random();
        int [] array = new int [size];
        for (int i=0; i<array.length; i++){
            array[i] = min + rand.nextInt(max-min);
        }
        return array;
    }
}



class Test24Test {
    public static void main(String[] args) {
        int [] a=Test24.createArray(10, 10, 20);
        for (int i=0; i< a.length; i++ ) {
            System.out.print(a[i] + " ");
        }
    }

}



//принимает 3 инта
//        1) размер выходного массива
//        2) нижняя граница
//        3) верхняя граница
//        возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы