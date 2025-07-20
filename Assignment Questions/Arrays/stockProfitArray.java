import java.util.*;

public class stockProfitArray {

  public static int stockAnalysis(int[] prices){
    int buyPrice = Integer.MAX_VALUE;
    int profit = 0;
    for(int i = 0 ; i < prices.length; i++){
      if(prices[i] < buyPrice){
        buyPrice = prices[i];
      }else{
        profit += prices[i] - buyPrice;
      }
    }
    return profit;
  }

  public static int bestProfit(int[] prices){
    int buyPrice = Integer.MAX_VALUE;
    int profit = 0;
    for( int i = 0; i<prices.length; i++){
      if(prices[i]< buyPrice){
        buyPrice = prices[i];
      }
      for( int j = i+1; j < prices.length; j++){
        int sellProfit = prices[j] - prices[i];
        System.out.println(" \nWe bought: " + prices[i] + " and Sold At: "+ prices[j] + " obtained Profit: "+ sellProfit);
        if(sellProfit > profit){
          profit = sellProfit;
          System.out.println("\n -> the profit updated is: " + profit);
        }
      }
    }
    return profit;
  }





  public static void main(String args[]){
    int prices[] = {7,1,5,3,6,4};
    System.out.println("\n ## The Overall Profit that can obtained is: "+ stockAnalysis(prices));
    System.out.println("\n ## The Max Profit  that can obtained is: "+ bestProfit(prices));

  }
}
