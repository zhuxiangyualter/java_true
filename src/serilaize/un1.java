package serilaize;
/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

public class un1 {

        public static String deserializeString(String s) {
            StringBuilder sb = new StringBuilder();
            String[] tokens = s.split(",");
            for (String token : tokens) {
                sb.append((char) Integer.parseInt(token));
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            String s = "104,101,108,108,111,44,32,119,111,114,108,100,33";
            System.out.println(deserializeString(s));
        }


}
