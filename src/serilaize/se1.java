package serilaize;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

public class se1 {

    public static String serializeString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append((int) s.charAt(i)).append(',');
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        String s = "hello, world!";
        System.out.println(serializeString(s));
    }
}
