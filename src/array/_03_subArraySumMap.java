package array;

/*
    배열의 요소를 순서대로 더했을 때 k와 같은 값이 나오는 횟수가 몇번인지 구하라. (Map 사용)
 */

import java.util.HashMap;
import java.util.Map;

public class _03_subArraySumMap {

    public static void main(String[] args) {
        int[] nums = { 3, 4, 7, 2, -3, 1, 4, 2 };
        System.out.println(new _03_subArraySumMap().subArraySum(nums, 7));
    }

    public int subArraySum(int[] nums, int k) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            map.put(sum, map.getOrDefault(sum, 0) + 1);

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

        }

        return count;
    }

}
