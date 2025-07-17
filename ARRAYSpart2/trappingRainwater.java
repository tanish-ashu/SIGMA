import java.util.*;
import java.lang.*;

public class trappingRainwater {
  public static int trappedRainWater(int height[]){
    int n = height.length;
    int leftMax[] = new int[n];
    int rightMax[] = new int[n];
    
// calculate left max boundary - array
    leftMax[0] = height[0];
    for(int i=1; i<n; i++){
        leftMax[i] = Math.max(leftMax[i-1], height[i]);
    }
// calculate right max boundary - array
    rightMax[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--){
        rightMax[i] = Math.max(rightMax[i+1], height[i]);
    }
    
    int waterTrapped = 0;
// loop
    for(int i=0; i<n; i++){
        // waterLevel = min(leftmax, rightmax)
        int waterLevel = Math.min(leftMax[i],rightMax[i]);
        // waterTrapped =  waterLevel - height[i]
        waterTrapped+= waterLevel- height[i];
    }
  return waterTrapped;
  }
  
  public static void main(String args[]){
      int height[] = {4,2,0,6,3,2,5};
      int WaterTrapped = trappedRainWater(height);
      System.out.println("The water Trapped volume:" + WaterTrapped);
  }
  
}

