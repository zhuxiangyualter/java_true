package Reflect.Classes;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class method {
    public static void main(String[] args) {
        String [] sp = new String [10];
        Integer integer = new Integer(5);
        Class<? extends String[]>str = sp.getClass();
        System.out.println(str);
        Class<Integer> incls = int.class;
        System.out.println(incls);
        Class<? extends Integer> ints = integer.getClass();
        System.out.println(ints);
        try {
            Class<?> cls =Class.forName("java.util.HashMap");
            System.out.println(cls.getName());
            System.out.println(cls.getCanonicalName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
