package Reflect.Classes;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
class Gener{

}
public class demo {
    static class Test<U extends Comparable<U>,V>{
        U u;V v;
        List<String> list;
        public U test(List<? extends Number> numbers){
            return null;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class<?> cls = Test.class;
        for (TypeVariable t: cls.getTypeParameters()){
            System.out.println(t.getName()+" extends "+ Arrays.toString(t.getBounds()));
        }
        Field fu = null;
        try {
            fu = cls.getDeclaredField("u");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fu.getGenericType());
        Field flist = cls.getDeclaredField("list");
        Type listtype = flist.getGenericType();
        if (listtype instanceof ParameterizedType){
            ParameterizedType ptype = (ParameterizedType) listtype;
            System.out.println("raw type:"+ptype.getRawType()
            +",type arguments:" +Arrays.toString(ptype.getActualTypeArguments())
            );
        }

                Method m =cls.getMethod("test",new Class[]{
                        List.class
                });

            for (Type t: m.getGenericParameterTypes()){
                System.out.println(t);
            }

    }
}
