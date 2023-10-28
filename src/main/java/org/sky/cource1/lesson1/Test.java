package org.sky.cource1.lesson1;

public class Test {

    public static void main(String[] args) {
        String str = "12331";
        System.out.println(isPolindrom(str));
    }

    private static boolean isPolindrom(String str) {
        return str.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W",""))
                        .reverse().toString());
    }
}
