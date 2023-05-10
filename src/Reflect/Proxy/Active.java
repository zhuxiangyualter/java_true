package Reflect.Proxy;

import java.lang.reflect.*;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Active {
    static interface IService{
        void hello();
    }
    static class RealService implements Active.IService {
        @Override
        public void hello() {
            System.out.println("hello");
        }
    }
    static class SimpleInvocation implements InvocationHandler{
        private Object onj;

        public SimpleInvocation(Object onj) {
            this.onj = onj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("enter" + method.getName());
            Object result = method.invoke(onj,args);
            System.out.println("leaving" + method.getName());
                return result;
        }
    }
    public static void main(String[] args) {
        IService realService = new RealService();

         IService proxyservice = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(),
                new  Class<?>[]{IService.class},new SimpleInvocation(realService));
        proxyservice.hello();


    }

}
