package Method;

public class Test26 {

    static String revers(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {

            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        String result = String.valueOf(charArray);
        System.out.println(result);
        return result;
    }
}


class Test26Test {
    public static void main(String[] args) {
        String str = "helloworld1";
        Test26.revers(str);
    }
}


