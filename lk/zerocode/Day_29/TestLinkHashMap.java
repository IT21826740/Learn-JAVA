package lk.zerocode.Day_29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkHashMap {

    public static void main(String[] args) {
        Map<String, String> createMap = new LinkedHashMap<>();
        createMap.put("lk", "Sri Lanka");
        createMap.put("in", "India");
        createMap.put("jp", "Japan");
        createMap.put("us", "Amarica");
        createMap.put("au", "Australia");

        System.out.println(createMap);
    }

}
