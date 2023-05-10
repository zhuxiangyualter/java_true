package STL_bg.Enum;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class map {
    public static void main(String[] args) {
        clothes clothes = new clothes();

    }
}
class clothes{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public STL_bg.Enum.size getSize() {
        return size;
    }

    public void setSize(STL_bg.Enum.size size) {
        this.size = size;
    }

    String id;
    size size;
    public static Map<size,Integer> count(List<clothes> clothes){
        Map<size,Integer> map1 = new EnumMap<>(STL_bg.Enum.size.class);
        for (clothes c : clothes){
            STL_bg.Enum.size size1 = c.getSize();
            Integer counts = map1.get(size1);
            if (counts != null){
                map1.put(size1,counts+1);
            }else {
                map1.put(size1,1);
            }
        }
        return map1;
    }
}