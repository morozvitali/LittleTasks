package Method;
import java.util.Objects;
public class Test14 {
    public static String[][] filterOut(String filterString, String[][] array) {
        String [][] resultFiltering = new String[array.length][];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if (Objects.equals(array[i][y], filterString)) {
                    resultFiltering[i] = array[i];
                } else {
                   // resultFiltering[i] = null;

                }
            }
        }
        return resultFiltering;
    }
}

 class Test14Test {
    public static void main(String[] args) {
        System.out.println("Пример 14");
        System.out.println("Условие: Принимает массив строк и просто подстроку, " +
                "возвращает массив строк которые содержат данную подстроку. " +
                "т.е. отфильтрованый из первого");

        String someStrData = "sit";

        String[][] stringArray = {{"Lorem", "ipsum", "dolor", "sit"},
                {"amet", "consectetur", "adipiscing", "elit", "sit"},
                {"sed", "do", "eiusmod", "tempor", "incididunt", "sit"},
                {"ut", "labore", "et", "dolore", "magna", "aliqua"}};


        String[][] a = Test14.filterOut (someStrData, stringArray);
        // проверка корректности возврата значения..
        System.out.print("Выведем массив строк: ");
        for (int j=0; j<a.length; j++){
            for (int i=0;  i < a[j].length; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
 }