import java.util.*;


public class waterTrapped {
  public static int volume(int arr[]){
    int waterTrapped = 0;
    for(int i = 1; i<arr.length-1; i++){
      int leftWall = 0;
      int rightWall= 0;
      int currWall = arr[i];
      for(int j = i-1; j>=0; j--){
        leftWall = Math.max(leftWall,arr[j]);
      }
      for(int j = i+1; j< arr.length; j++){
        rightWall = Math.max(rightWall, arr[j]);
      }
      if(rightWall > arr[i] && leftWall > arr[i]){
        waterTrapped += (Math.min(leftWall, rightWall) - arr[i] ) * 1;
      }
    }
    return waterTrapped;
  }



  public static void main(String[] args) {
    int walls[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    int walls2[] = {4,2,0,3,2,5};
    int waterTrapped = volume(walls);
    System.out.println("The volume water trapped is: " + waterTrapped);
    System.out.println("The volume water trapped is: " + volume(walls2));
  }
  
}
