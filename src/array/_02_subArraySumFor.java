package array;

/*
    배열의 요소를 순서대로 더했을 때 k와 같은 값이 나오는 횟수가 몇번인지 구하라. (For문 사용)
 */

public class _02_subArraySumFor {

    public static void main(String[] args) {
        int[] nums = { 3, 4, 7, 2, -3, 1, 4, 2 };
        System.out.println(new _02_subArraySumFor().subArraySum(nums, 7));
    }

    public int subArraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    System.out.println("sum = " + sum + " nums[" + j + "] = " + nums[j]);
                    count++;
                }
            }
        }

        return count;
    }

}
