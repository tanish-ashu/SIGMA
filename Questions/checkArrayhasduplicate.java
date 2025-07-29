import java.util.*;

public class checkArrayhasduplicate {
  public static boolean hasduplicate(int arr[]){
    for(int i = 0; i<arr.length; i++){
      for(int j = i+1; j<arr.length; j++){
        if(arr[i] == arr[j]){
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int nums[] = { 2,4,6,8,2};
    int nums2[] = { 2,4,6,8,10};
    System.out.println(hasduplicate(nums));
    System.out.println(hasduplicate(nums2));
  }
  
}
