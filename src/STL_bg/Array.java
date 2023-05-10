package STL_bg;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import org.w3c.dom.Node;

import javax.sound.midi.Sequence;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        ArrayList<String> strlist=new ArrayList<String>();
        integers.add(5);
        integers.add(67);
        integers.add(779);
        System.out.println(integers.isEmpty());
        System.out.println(strlist.size());
        System.out.println(integers.size());
        strlist.indexOf(6);
        integers.contains(2);
        integers.remove(1);
        for (Integer A : integers) {
            System.out.println(A+"i");
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter DATE =DateTimeFormatter.ofPattern("yyy-mm-dd  hh--minmin--ss");
        String format = DATE.format(localDateTime);
        integers.trimToSize();
        Deque<String> dp = new LinkedList<>(
                Arrays.asList(new String[]{"a","b","c"}));
        Iterator<String> it = dp.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }

    }
}
class cat{
    String name;
    int age;

    public cat() {
    }
}