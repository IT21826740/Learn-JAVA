package lk.zerocode.Day_29;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.reverseOrder();
        Map<String, String> createMap = new TreeMap<>(comparator);

        createMap.put("lk", "Sri Lanka");
        createMap.put("in", "India");
        createMap.put("jp", "Japan");
        createMap.put("us", "Amarica");
        createMap.put("au", "Australia");

        System.out.println(createMap);

        for(Map.Entry<String,String> entry : createMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
