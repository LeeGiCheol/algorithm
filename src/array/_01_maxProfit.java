package array;

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


