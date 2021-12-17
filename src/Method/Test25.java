package Method;
public class Test25 {
    static boolean checkContains(String str) {
        return str.contains("@") || str.contains(".");
    }
}

class Test25Test {
    public static void main(String[] args) {
        boolean a = Test25.checkContains("werqf@czc");
        System.out.println(a);
    }
}


//    принимает строку, возвращает тру если в строка содержит однин символ @, и хотя бы одну точку