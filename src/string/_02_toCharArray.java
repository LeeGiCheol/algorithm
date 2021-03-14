package string;

/*
    '(' ')' 와 같은 유효한 parentheses String을 리턴하라.
    ')' '(' 는 안된다

    문제의 핵심은 )()( 이러한 문자이다.

    temp에 값을 다 담고도 openBrace가 1이라면
    ()( 이와 같이 쌍이 제대로 맞지 않는 것.
    그렇기 때문에 진짜 값인 result는 temp를 뒤집어서 연산한다.
    그 후 리턴할때 다시 reserve를 해서 완성시킨다.
 */

public class _02_toCharArray {
    public static void main(String[] args) {
        String s = ")in(f(l)ea)r)n)";
//        String s = ")()(";
        System.out.println(_02_toCharArray.solve(s));
    }

    private static String solve(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int openBrace = 0;

        for(char c : s.toCharArray()) {
            if (c == '(') {
                openBrace++;
            } else if (c == ')') {
                if (openBrace == 0) {
                    continue;
                }
                openBrace--;
            }

            temp.append(c);
        }

        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == '(' && openBrace-- > 0) {
                continue;
            }
            result.append(temp.charAt(i));
        }

        return result.reverse().toString();
    }

}
