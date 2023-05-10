package STL_bg.Hash;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hashmap {
    public static void main(String[] args) {
        Random rnd = new Random();
        Map<Integer,Integer> count = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int num = rnd.nextInt(4);
            Integer cot = count.get(num);
            if (cot == null){
                count.put(num,1);
            } else {
                count.put(num, cot+1);
            }
        }
        for (Map.Entry<Integer,Integer> kv : count.entrySet()){
            System.out.println(kv.getKey()+","+ kv.getValue());
        }
       HashMap<Integer,String> demo = new HashMap<>();
        demo.put(0,"hello");
        demo.put(1,"15llo");
        System.out.println(demo.get(1));
        System.out.println(demo.containsValue("hello"));
    }
}
