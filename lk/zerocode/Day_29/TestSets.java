package lk.zerocode.Day_29;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        // Set <String> createSet = new HashSet<>();
        // Set <String> createSet = new LinkedHashSet<>();
        //Set <String> createSet = new TreeSet<>();
        Comparator<String> comparator = Comparator.reverseOrder();
        Set <String> createSet = new TreeSet<>(comparator);


        createSet.add("Sri Lanka");
        createSet.add("India");
        createSet.add("Japan");
        createSet.add("Amarica");
        createSet.add("Australia");

        System.out.println(createSet);

        for (String country : createSet) {
            System.out.println(country);
        }

    }
}
