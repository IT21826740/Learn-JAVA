package lk.zerocode.Day_29;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashMap {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Map <String,String> createMap = new Hashtable<>();
        Map <String,String> createMap2 = new HashMap<>(18,0.8f);
        createMap.put("lk","Sri Lanka");
        createMap.put("in","India");
        createMap.put("jp","Japan");
        createMap.put("us","Amarica");
        createMap.put("au","Australia");
        createMap.put("lk","South Africa");

        System.out.println(createMap);
        System.out.println("------------------------------------");

        for(Map.Entry<String,String> entry : createMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("------------------------------------");
        System.out.println(createMap.get("jp")); // geenerete Hash code value and search hash bucket find "JP" key using equals method
        System.out.println(createMap.get("lk"));


    }
}
