import java.util.*;

public class SortingMixed {
  // public static void bubbleSort(int[] arr){
  //   for(int i = 0; i<arr.length; i++){
  //     int swapCount = 0;
  //     for(int i = 0; i<arr.length-1-i; i++){
  //       if(arr[i] > arr[i+1]){
  //         int temp = arr[i];
  //         arr[i] = arr[i+1];
  //         arr[i+1] = temp;
  //         swapCount++;
  //       }
  //       }
  //       if(swapCount == 0){
  //         return;
  //     }
  //   }
  // }

  public static void insertionSort(int arr[]){
      for(int i = 1; i<arr.length; i++){
          int temp = arr[i];
          int j = i-1;
          while( j >= 0 && arr[j] > temp){
            arr[j+1] = arr[j];
            j--; 
          }
          arr[j+1] = temp;
      }
  }




  public static void main(String[] args) {
    int [] nums = {3,6,2,1,8,7,4,5,3,1};
    // DONE bubbleSort(nums);
   // selectioSort(nums);
   insertionSort(nums);
   // CountingSort(nums);
    System.out.println(Arrays.toString(nums));
  }
  
}
