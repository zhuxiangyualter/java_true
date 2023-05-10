package Reflect.Proxy;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class SimpleStatic {
    static interface IService{
        void hello();
    }
    static class RealService implements IService{
        @Override
        public void hello() {
            System.out.println("hello");
        }
    }
    static class TraceProxy implements IService{
        private IService realService;
        public TraceProxy(IService realService){
            this.realService=realService;
        }
        @Override
        public void hello() {
            System.out.println("enter hello");
            this.realService.hello();
            System.out.println("leaving hello");
        }
    }
    public static void main(String[] args) {
        IService realService = new RealService();
        IService traceProxy = new TraceProxy(realService);
        traceProxy.hello();
    }
}
