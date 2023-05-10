package Reflect.Classes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class fields {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<?> cls = Integer.class;
        try {
            Method method = cls.getMethod("parseInt", new Class[]{String.class});
            System.out.println(method.invoke(null, "123"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Map<String,Integer> map = HashMap.class.newInstance();
        map.put("hi",123);
    }
}
