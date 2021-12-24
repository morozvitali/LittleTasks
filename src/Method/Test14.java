package Method;

import java.util.Objects;

public class Test14 {
    public static String[][] filterOut(String filterString, String[][] array) {

        int count = 0; //посчитаем количество

        Outer: for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if((array[i][y]).contains(filterString)) {
                    count++;
                    continue Outer;
                }
            }
        }

        String[][] resultFiltering = new String[count][];
        count = 0;//заполним массив

        Outer: for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if((array[i][y]).contains(filterString)) {
                    resultFiltering[count++] = array[i];
                    continue Outer;
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

        String someStrData = "it";

        String[][] stringArray = {{"Lorem", "ipsum", "dolor", "amet"},
                {"amet", "consectetur", "adipiscing", "elit", "ametelit"},
                {"sed", "eiusmod", "tempor", "incididunt", "ametelit"},
                {"ut", "labore", "et", "dolore", "magna", "amet"}};


        String[][] a = Test14.filterOut(someStrData, stringArray);
        // проверка корректности возврата значения..
        System.out.print("Выведем массив строк: ");

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}