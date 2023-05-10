package Reflect.Loader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */

/**
public class ConfigDemo {
    public interface IService{
        public void action();
    }
    public static IService createService(){
        try {
            Properties prop = new Properties();
            String filename = "";
            prop.load(new FileInputStream(filename));
            String className = prop.getProperty("service");
            Class<?> cls = Class.forName(className);
            return (IService) cls.newInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        IService service = createService();
        service.action();
    }
}*/
