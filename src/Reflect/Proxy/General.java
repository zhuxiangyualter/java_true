package Reflect.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class General {
    static interface IServiceA{
        public void hello();
    }
    static class ServiceAI implements IServiceA{
        @Override
        public void hello() {
            System.out.println("hello");
        }
    }
    static interface IServiceB{
        public void fly();
    }
    static class ServiceBI implements IServiceB{
        @Override
        public void fly() {
            System.out.println("flying");
        }
    }
    static class SimpleIN implements InvocationHandler{
        private Object object;
        public SimpleIN(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("enter" + object.getClass().getSimpleName()
            +"::"+method.getName());
            Object result = method.invoke(object,args);
            System.out.println("leaving"+object.getClass().getSimpleName()
            +"::"+method.getName());
            return result;
        }
    }

    /**
     *  接口A&B  调用同样方法getProxy
     *  享受同样代理逻辑InvocationHandler
     * @param intf
     * @param object
     * @return
     * @param <T>
     */
    private static <T> T getProxy(Class<T> intf,T object){
        return (T) Proxy.newProxyInstance(intf.getClassLoader(),
                new Class<?>[]{intf},new SimpleIN(object));
    }

    public static void main(String[] args) throws Exception{
        IServiceA a = new ServiceAI();
        IServiceA aproxy = getProxy(IServiceA.class,a);
        aproxy.hello();
        IServiceB iServiceB = new ServiceBI();
        IServiceB BProxy = getProxy(IServiceB.class,iServiceB);
        BProxy.fly();
    }
}
