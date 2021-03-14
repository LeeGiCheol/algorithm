package string;

/*
    Palindrome = 회문
    banana = anana
    abcaba = aba

    즉 앞으로 읽어도 뒤로 읽어도 같은 문자열을 의미한다.
    한 문장에 palindrome은 여러개 있을 수도 있는데
    이 중 가장 긴 palindrome을 찾는다.

    // 1개의 문자도 palindrome이다.
 */

public class _04_Longest_Palindrome {

    public _04_Longest_Palindrome() {
    }

    public static void main(String[] args) {
        String s = "bananas";

        System.out.println(new _04_Longest_Palindrome().solve(s));
    }

    private int start, end;

    private String solve(String s) {
        int len = s.length();

        if (len < 2) return s;

        for (int i = 0; i < len - 1; i++) {
            finrSubstring(s, i, i);
            finrSubstring(s, i, i + 1);
        }

        return s.substring(start, start + end);
    }

    private void finrSubstring(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; right ++;
        }

        if (end < right - left - 1) {
            end = right - left - 1;
            start = left + 1;
        }

    }

}
