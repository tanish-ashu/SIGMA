import java.util.*;
// time complexity - O(n2)

public class insertionSort {
  public static int[] sort(int arr[]){
    for(int i=1; i<arr.length; i++){
      int key = arr[i];
      int j = i - 1;
      while( j >= 0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
  }
    return arr;
}

  public static void main(String args[]){
    int array[] = {5,4,1,3,2};
    int sortedArray[] = sort(array);
    System.out.println("The sorted Array is:" + Arrays.toString(sortedArray));



  }
  
}
