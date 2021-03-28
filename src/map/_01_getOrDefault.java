package map;

import java.util.HashMap;
import java.util.Map;

/*
    주어진 문자열에서 반복되지않는 첫 번째 문자를 찾아 index 반환
 */
public class _01_getOrDefault {

    public static void main(String[] args) {
        String str = "leegicheol";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
        if (str == null) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }



}
