import java.util.*;


public class tipleSumZero {
  public static void tiplets(int arr[]){
    int [][] triplets = new int [50] [3];
    int rowCount = 0;
    for( int i = 0; i < arr.length; i++){
      for( int j = i+1; j < arr.length; j++ ){
        for( int k = j+1; k < arr.length; k++){
          if(arr[i] + arr[j] + arr[k] == 0){
            triplets[rowCount][0] = arr[i];
            triplets[rowCount][1] = arr[j];
            triplets[rowCount][2] = arr[k];
            rowCount++;
          }
        }
      }
    }
    for(int i = 0; i< rowCount ; i++){
      System.out.println(Arrays.toString(triplets[i]));
    }
  }


  public static void main(String[] args) {
    int nums[] = {-1,0,1,2,-1,-4};
    tiplets(nums);
  }
  
}
