package Method;

public class Test25 {
    static boolean checkContains(String str) {
        int indexOfLetter = str.indexOf("@");
        if (str.indexOf("@", indexOfLetter + 1) > indexOfLetter) {
            return false;
        } else {
            return str.contains("@") && str.contains(".");
        }
    }
}

class Test25Test {
    public static void main(String[] args) {
        boolean a = Test25.checkContains("@werqf.cz@c.");
        System.out.println(a);
    }
}


//    принимает строку, возвращает тру если в строка содержит однин символ @, и хотя бы одну точку
