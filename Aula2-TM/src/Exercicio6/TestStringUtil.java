package Exercicio6;

public class TestStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.rPad("TESTE", 10) + "RIGHT PAD");
        System.out.println(StringUtil.lPad("TESTE", 10) + "LEFT PAD");

        System.out.println(StringUtil.lTrim("    Test left trim     "));
        System.out.println(StringUtil.rTrim("    Test right trim     "));
        System.out.println(StringUtil.trim("    Test all trim     "));

        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", '|', 2));
        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", 'n', 2));
        System.out.println(StringUtil.indexOfN("aaaaaaabbbbbaaacccc", 'a', 8));
    }
}
