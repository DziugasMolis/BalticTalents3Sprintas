package java17.Mapai;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static void insertAndPrint(Map<Integer, String> map)
    {
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        insertAndPrint(hashMap);

        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
        insertAndPrint(linkedMap);

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        insertAndPrint(treeMap);
    }
}
