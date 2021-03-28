package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _00_MapIter {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ABC");
        map.put(2, "DEF");
        map.put(3, "123");

        for (Integer key : map.keySet()) {
            System.out.print("key = " + key + ", ");
            System.out.println("value = " + map.get(key));
        }

        System.out.println();

        for (Map.Entry<Integer, String> element : map.entrySet()) {
            System.out.print("entry key = " + element.getKey() + ", ");
            System.out.println("entry value = " + element.getValue());
        }

        Iterator<Integer> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            System.out.print("iterator key = " + next + ", ");
            System.out.println("iterator value = " + map.get(next));
        }


    }

}
