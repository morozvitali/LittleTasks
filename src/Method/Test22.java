package Method;

public class Test22 {
    static public int [] reverse (int array []) {
        int tempNumb;
        for (int i=0; i< array.length/2; i++) {
            tempNumb = array[i];
            array[i] = array [array.length - i - 1];
            array [array.length - i - 1] = tempNumb;
        }
        return array;
    }
}

class Test22Test {
    public static void main(String[] args) {
        int [] array = {1, 2, 4,0, 6, 9,7,6,43,2,46,2,1,0};
        Test22.reverse(array);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

//    принимает масив интов, возвращает его же но в реверсном порядке