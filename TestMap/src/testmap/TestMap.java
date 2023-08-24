package testmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Abid", 10);
        hashMap.put("Uabid", 30);
        hashMap.put("Luna", 20);
        
        System.out.println("show hashMap");
        //key ascending order
        System.out.println(hashMap+" \n");
        
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Abid", 10);
        treeMap.put("Uabid", 30);
        treeMap.put("Luna", 20);
        //key ascending order
        System.out.println("Show treemap");
        System.out.println(treeMap+" \n");
        
        Map<String, Integer> linkedHasMap = new LinkedHashMap<>(16, .75f, true);
        linkedHasMap.put("Abid", 10);
        linkedHasMap.put("Uabid", 30);
        linkedHasMap.put("Luna", 20);
        System.out.println(linkedHasMap.get("Abid"));
        //from least recently accessed to most recently.
        System.out.println("Show linkedHasMap");
        System.out.println(linkedHasMap+" \n");
    }
    
}
