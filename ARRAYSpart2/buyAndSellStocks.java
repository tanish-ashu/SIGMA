import java.util.*;
import java.lang.*;

// time complexity - O(n)

public class buyAndSellStocks {

  public static int buyAndSellStock(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0; i<prices.length; i++){
      if(buyPrice < prices[i]){
        int profit = prices[i] - buyPrice;
        if(maxProfit<profit){
          maxProfit = profit;
        }
      }
      else{
        buyPrice = prices[i];
      }
    }
      return maxProfit;
  }


  public static void main(String args[]){
    int prices[]  =  {7,1,5,3,6,4};
    int maxProfit = buyAndSellStock(prices);
    System.out.println("The Maximum profit obtained is:" + maxProfit);
  }
  
}
