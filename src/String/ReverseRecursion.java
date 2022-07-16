package String;

public class ReverseRecursion {

    public static void main(String[] args) {

        String s = "Sandy";
        System.out.println(recursive(s));

    }

    private static String recursive(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

        return recursive(s.substring(1)) + s.charAt(0);

    }
}
