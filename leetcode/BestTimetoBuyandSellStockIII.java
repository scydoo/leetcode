package lee;
/*
 * Best Time to Buy and Sell Stock III�����Ʊ��ֻ���Խ������Σ�
 ˼·���ҵ�������һ�̣�ǰ���ǵ�һ��ģʽ�����������ǵ�һ��ģʽ���������ڣ�
 һ��Ҫ��֤��O��N���������ȴ�������ĳһ����ǰ�����棬�Լ���ĳһ������������档
 */
public class BestTimetoBuyandSellStockIII {

	public static int maxProfit(int[] prices) {
		/*
		 * ��������maxBefore��maxAfter���ֱ���iΪ�м�㱣��
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
