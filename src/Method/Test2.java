package Method;
public class Test2 {
    static void doPrint (String[][] array) {
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
    }
}
    class Test2Test {
      public static void main(String[] args) {
          System.out.println("Пример 2");
          System.out.println("Условие: Метод принимает 2м массив строк, выводит его на экран");

          String[][] stringArray = {{"Lorem", "ipsum", "dolor", "sit"},
                  {"amet", "consectetur", "adipiscing", "elit"},
                  {"sed", "do", "eiusmod", "tempor", "incididunt"},
                  {"ut", "labore", "et", "dolore", "magna", "aliqua"}};
          Test2.doPrint(stringArray);
      }
  }