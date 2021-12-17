package Method;

public class Test26 {
    static String revers(String str) {
        String strRev = "";
        for (int i = 0; i < str.length(); i++) {
            strRev = str.charAt(i) + strRev;
        }
        return strRev;
    }
}


class Test26Test {
    public static void main(String[] args) {

        System.out.println(Test26.revers("1234567890"));
    }
}


