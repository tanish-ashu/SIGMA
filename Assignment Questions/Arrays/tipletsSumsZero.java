import java.util.*;

public class tipletsSumsZero {
  public static void findTriplet(int[] nums){
    int Mset[][] = new int[50][3];
    int rowCount = 0;
    for( int i = 0; i<nums.length; i++){
      for(int j = i+1; j<nums.length; j++){
        for(int k= j+1; k<nums.length; k++){
          if(nums[i] + nums[j] + nums[k] == 0){
            Mset[rowCount][0] = nums[i];
            Mset[rowCount][1] = nums[j];
            Mset[rowCount][2] = nums[k];
            
            rowCount++;   
          }
        }
      }
    }
    for(int i = 0; i< rowCount; i++){
      System.out.println(Arrays.toString(Mset[i]));
    }
  }

  public static void main(String args[]){
    int nums[] = {-1,0,1,2,-1,-4};
    findTriplet(nums);

  }
}
