package STL_bg.Trees;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.math.BigInteger;
import java.security.KeyStore;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Treemap {
    public static void main(String[] args) {

        TreeMap<String,String> treemap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Map<String,String> treemap1 = new TreeMap<>(Collections.reverseOrder());
        Map<String,String> treemap2 = new TreeMap<>(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        TreeMap<String,String> mapl = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treemap.put("D","abstrave");
        treemap.put("v","hello");
        treemap.put("ca","NIHAO");
        for (Map.Entry<String,String> KV : treemap.entrySet()){
            System.out.println(KV.getKey()+"="+KV.getValue());
        }
        TreeMap<String,Integer> objectObjectTreeMap = new TreeMap<>(new Comparator<String>() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy--mm-dd");
            @Override
            public int compare(String o1, String o2) {

                try {
                    return simpleDateFormat.parse(o1).compareTo(simpleDateFormat.parse(o2));
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });
        objectObjectTreeMap.put("2016--12--1",100);
        objectObjectTreeMap.put("2015--12--9",90);
        objectObjectTreeMap.put("2020--5--16",120);
        for (Map.Entry<String,Integer> KV : objectObjectTreeMap.entrySet()){
    System.out.println(KV.getKey()+"="+KV.getValue());
}
        
    }
}
