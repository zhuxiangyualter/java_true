package STL_bg.Hash;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Linkedhashmap {
    public static void main(String[] args) {
        Map<String,Integer> accessMap = new LinkedHashMap<>(16, 0.75f, true);
        accessMap.put("c",100);
        accessMap.put("d",200);
        accessMap.put("a",500);
        accessMap.get("c");
        accessMap.put("d",300);
        for (Map.Entry<String,Integer> entry : accessMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
