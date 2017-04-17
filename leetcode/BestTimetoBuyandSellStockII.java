package lee;
/*
 * 区别上一题,可以买卖多次
思路，不要想太复杂了，只要出现今天比昨天多就进行买卖。
 */
public class BestTimetoBuyandSellStockII {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
    }

}
