package array;

/*
    주식 한 주를 한 번 사고팔아 얻을 수 있는 최대 수익을 계산한다.

    주식을 샀으면 무조건 팔아야한다.
    주식을 사지 않으면 팔 수 없다.
 */

public class _01_maxProfit {

    public static void main(String[] args) {
        int[] prices = { 8, 2, 6, 5, 1, 7, 5 };

        System.out.println(new _01_maxProfit().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int max = 0;
        int sofaMin = prices[0];

        for (int price : prices) {
            if (price < sofaMin) {
                sofaMin = price;
            } else {
                max = Math.max(max, price - sofaMin);
            }
        }

        return max;
    }

}


