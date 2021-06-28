package Exercicio6;

public class StringUtil {
    public static String rPad(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String lPad(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    public static String rTrim(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String lTrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN (String s, char c, int n) {
        int index = 0;
        for(int i = 1; i < n; i++) {
            index = s.indexOf(c, index) + 1;
        }
        return s.indexOf(c, index);
    }
}
