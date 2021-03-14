package string;

/*
    문제
    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

    출력
    입력으로 주어진 숫자 N개의 합을 출력한다.

    input
    5
    54321

    ouput
    15
 */

import java.util.Scanner;

public class _01_Ex_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        String number = sc.next();
        int sum = 0;

        for (int i = 0; i < testCase; i++) {
            int num = number.charAt(i) - '0';
            sum += num;
        }

        System.out.println(sum);
    }

}
