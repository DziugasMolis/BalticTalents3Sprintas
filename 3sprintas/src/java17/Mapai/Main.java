package java17.Mapai;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static void insertAndPrint(Map<Integer, String> map)
    {
        int[] array= {1, -3, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
//        map.put(null, "null");
        for (Integer k: map.keySet())
        {
            System.out.print(k + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        insertAndPrint(hashMap);

        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        insertAndPrint(linkedMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        insertAndPrint(treeMap);
    }
}
