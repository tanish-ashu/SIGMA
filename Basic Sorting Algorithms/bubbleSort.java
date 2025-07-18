import java.util.*;
// time complexity - O(n2)
//  optimized time complexity - O(n)

public class bubbleSort {
  public static int[] sort(int arr[]){
    int n = arr.length;
    int swaps = 0;
    for(int turn=0; turn<n-1; turn++){
      for(int j=0; j<n-1-turn; j++){
        if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        swaps++;
      }
      if(swaps==0){
        System.out.println("This array is already Sorted Exiting.");
        return arr;
      }
      }
    }
    return arr;
  }




  public static void main(String args[]){
    int array[] = {5,4,1,3,2};
    int array2[] = {1,2,3,4,5};
    int sortedNumbers[] = sort(array);
    System.out.println("The sorted Array is:" + Arrays.toString(sortedNumbers));
    int sortedNumbers2[] = sort(array2);
    System.out.println("As Array is:" + Arrays.toString(sortedNumbers2));


  }
  
}
