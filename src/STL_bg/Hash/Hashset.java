package STL_bg.Hash;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hashset {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("hello");
        HashSet<test> tests = new HashSet<>();
        tests.add(new test("dwa",12));
        tests.add(new test("fawg",16));
        tests.add(new test("fawg",16));

        System.out.println(tests);
    }
}
class test{
    String size;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        test test = (test) o;
        return age == test.age && Objects.equals(size, test.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, age);
    }

    @Override
    public String toString() {
        return "test{" +
                "size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public test(String size, int age) {
        this.size = size;
        this.age = age;
    }
}