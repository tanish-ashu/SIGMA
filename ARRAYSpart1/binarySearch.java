import java.util.*;

// ARRAY must be sorted.

public class binarySearch {
  public static int bSearch(int numbers[], int key) {
    int start = 0;
    int end = numbers.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      // comparisions
      if (numbers[mid] == key) {
        return numbers[mid];
      } else if (numbers[mid] > key) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 3, 4, 5, 6, 7, 9, 13 };
    int key = 13;

    int index = bSearch(numbers, key);

    if (index == -1) {
      System.out.println("The value is not found in the Array");
    } else {
      System.out.println("the key is at index:" + index);
    }

  }

}

/*
 * complexity
 * 
 * n/2k = 1 => n = 2k => k = log2 n => tc => (log n)
 * 
 * 
 */