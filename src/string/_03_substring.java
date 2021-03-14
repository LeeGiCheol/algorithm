package string;

public class _03_substring {
    public static void main(String[] args) {
        String[] strs = { "teacher", "test", "tea", "tr" };

        System.out.println(new _03_substring().solve(strs));
    }

    private String solve(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String firstStr = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(firstStr) != 0) {
                firstStr = firstStr.substring(0, firstStr.length() - 1);
            }
        }

        return firstStr;
    }
}
