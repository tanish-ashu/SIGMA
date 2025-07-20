import java.util.*;

public class rainWaterTrapped {

  public static int VolumeTrapped(int[] wall){
    int volume = 0;
    for( int i = 1; i< wall.length-1; i++){
      int leftBound = wall[i];
      int rightBound = wall[i];
      for( int j = i-1; j>=0; j--){
        leftBound = Math.max(leftBound, wall[j]);
      }
      for( int j = i+1; j< wall.length; j++){
        rightBound = Math.max(rightBound, wall[j]);
      }
      volume+= ( Math.min(leftBound,rightBound) - wall[i] )* 1;
    }
    return volume;
  }






  
  public static void main(String args[]){
    int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    int height2[] = {4,2,0,3,2,5};
    System.out.println("The Maximum wate volume that can be stored is: " + VolumeTrapped(height));
    System.out.println("The Maximum wate volume that can be stored is: " + VolumeTrapped(height2));
  }
}
