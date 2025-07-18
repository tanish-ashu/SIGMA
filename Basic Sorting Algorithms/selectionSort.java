import java.util.*;
// time complexity - O(n2)

public class selectionSort {
  public static int[] sort(int arr[]){
    int n = arr.length;
    for(int i=0; i<n-1; i++){
      int minPos = i;
      for(int j=i+1; j<n; j++){
        if(arr[minPos]>arr[j]){
          minPos = j;
        }
      }
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
    }
    return arr;
}





  public static void main(String args[]){
    int array[] = {5,4,1,3,2};
    int sortedArray[] = sort(array);
    System.out.println("The sorted Array is:" + Arrays.toString(sortedArray));



  }
  
}
