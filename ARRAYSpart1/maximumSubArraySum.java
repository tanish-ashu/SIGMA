import java.util.*;
import java.lang.*;

// time complexity -> O(n3);

class maximumSubArraySum {

  public static void printSubArray(int numbers[]) {
    int start;
    int end;
    int maxSubSum = Integer.MIN_VALUE;
    for (start = 0; start < numbers.length; start++) {
      for (end = start; end < numbers.length; end++) {
        int currSubSum = 0;

        for (int k = start; k <= end; k++) {
          currSubSum += numbers[k];
        }
        System.out.println(currSubSum);
        if (maxSubSum < currSubSum) {
          maxSubSum = currSubSum;
          System.out.println("new maxSubSum is:" + maxSubSum);
        }
      }
    }

    System.out.println("The maxsum SubArray Sum obtained is:" + maxSubSum);
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    int numbers2[] = { 1, -2, 6, -1, 3 };
    printSubArray(numbers);
    printSubArray(numbers2);
  
  }
}