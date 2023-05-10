package Reflect.Classes;

import java.util.UUID;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
class SimpleMapperDemo {}
class Student {
        String name;
        int age;
        Double score;

        public Student(Object ୟӣ, int i, double v) {

        }

    public static String toString(Student zhangsan) {
        return null;
    }
}

public class using {
    public static void main(String[] args) {
        Student zhangsan = new Student("16 ", 18, 89d);
        String str = Student.toString(zhangsan);

    }
}
