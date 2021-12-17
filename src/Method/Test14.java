package Method;
import java.util.Objects;
public class Test14 {
    public static String[] filterOut(String filterString, String[][] array) {
        String[] resultFiltering = new String[0];
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {

                if (Objects.equals(array[i][y], filterString)) {
                    resultFiltering = array[i];
                    break;
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

        String someStrData = "dolore";

        String[][] stringArray = {{"Lorem", "ipsum", "dolor", "sit"},
                {"amet", "consectetur", "adipiscing", "elit"},
                {"sed", "do", "eiusmod", "tempor", "incididunt"},
                {"ut", "labore", "et", "dolore", "magna", "aliqua"}};


        String[] a = Test14.filterOut (someStrData, stringArray);
        // проверка корректности возврата значения..
        System.out.print("Выведем массив строк: ");
        for (int j=0; j<a.length; j++){
            System.out.print(a[j] + " ");
        }
    }
 }