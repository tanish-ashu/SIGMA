import java.util.*;

public class stockProfit {

  public static int profit(int nums[]){
    int profit = 0;
    int buyPrice = nums[0];
    for(int i = 1; i< nums.length; i++){
      if(nums[i] < buyPrice){
        buyPrice = nums[i];
      }else{
        profit+= nums[i] - buyPrice;
      }
    }
    return profit;
  }

  // main logic 
  public static int maxProfit(int nums[]){
    int profit = 0;
    for(int i = 0; i<nums.length; i++){
      for(int j = i+1; j< nums.length; j++){
        if(nums[j] - nums[i] > profit){
          profit = nums[j] - nums[i];
        }
      }
    }
    return profit;
  }
  public static void main(String[] args) {
    int nums[] = {7,1,5,3,6,4};
    int profit = profit(nums);
    System.out.println("The profit obtained is: " +  profit);
    System.out.println("The MAX profit obtained is: " + maxProfit(nums));
  }
  
}
