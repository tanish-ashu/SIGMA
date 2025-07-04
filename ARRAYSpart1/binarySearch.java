import java.util.*;

// ARRAY must be sorted.

public class binarySearch {
  public static int bSearch(int numbers[], key){
    int start = 0;
    int end = numbers.length-1;

    while(start <= end) {
      int mid = (start+end)/2;

      // comparisions
      if(numbers[mid] == key) {
        return numbers[mid];
      }
      else if (numbers[mid]> key){
        end = mid;
      }
      else{
        start = mid;
      }
    }

  }
  return -1;

  public static void main(String [] args){
    int numbers[] = {2,4,5,6,7,3,9};
    int key = 3;

    System.out.println("the key is at index:" +bSearch(numbers, key))
  }

}
