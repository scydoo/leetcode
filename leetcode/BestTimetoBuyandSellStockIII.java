package lee;
/*
 * Best Time to Buy and Sell Stock III（买股票，只可以进行两次）
 思路，找到卖出那一刻，前面是第一题模式，往后走又是第一题模式，错误在于，
 一定要保证在O（N），所以先存下来到某一个点前的利益，以及到某一个点往后的利益。
 */
public class BestTimetoBuyandSellStockIII {

	public static int maxProfit(int[] prices) {
		/*
		 * 两个数组maxBefore和maxAfter，分别以i为中间点保存
		 */
		int maxProfit = 0;
		int length = prices.length;
		int min = Integer.MAX_VALUE;
		int res= 0;
		int[] maxBefore = new int[length];
		int[] maxAfter = new int[length];
		for(int i = 0; i < prices.length; i++){
			if(prices[i] < min){
				min = prices[i];
			} else if(prices[i] - min > res){
				res = prices[i] - min;
			}
			maxBefore[i] = res;
		}
		int max = 0;
		res = 0;
		for(int i = length - 1; i >= 0; i--) {
			if(max - prices[i] > res) {
				res = max - prices[i];
			} 
			if (prices[i] > max) {
				max = prices[i];
			}
			maxAfter[i] = res;
		}
		for(int i = 0 ; i < length; i++) {
			maxProfit = Math.max(maxProfit, maxBefore[i] + maxAfter[i]);
		}
		return maxProfit;
	}

}
