package Method;
import java.util.Random;

public class Test23 {
    static int [] createArray (int size, int max) {
        Random rand = new Random();
        int [] array = new int [size];
        for (int i=0; i<array.length; i++){
            array[i] = rand.nextInt(max+1);
        }
            return array;
    }
}



class Test23Test {
    public static void main(String[] args) {
       int [] a=Test23.createArray(20,100);
        for (int i=0; i< a.length; i++ ) {
            System.out.println(a[i]);
        }
    }

}