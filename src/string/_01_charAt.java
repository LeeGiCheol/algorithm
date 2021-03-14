package string;

/*
    String Type num1 과 num2을 int type으로 더하고, 결과 값을 String Type으로 리턴해라.

    (Integer.parseInt()를 사용하지 않는다.)
 */

public class _01_charAt {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "888";

        System.out.println(new _01_charAt().solve(num1, num2));
    }

    private String solve(String num1, String num2) {
        // 1
        int carry = 0; // 올라가는 수
        StringBuilder sb = new StringBuilder();
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;

        // 2
        while (num1Length >= 0 || num2Length >= 0) {
            int n1 = num1.charAt(num1Length) - '0';
            int n2 = num2.charAt(num2Length) - '0';

            int sum = n1 + n2 + carry;
            carry = sum / 10;

            sb.append(sum % 10);

            num1Length--; num2Length--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        // 뒤에서부터 구했으니 reserve
        return sb.reverse().toString();
    }

}
