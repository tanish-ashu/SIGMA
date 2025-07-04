import java.util.*;

public class largestNumber {

  public static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }
      if (smallest > numbers[i]) {
        smallest = numbers[i];
      }
    }
    System.out.println("Smallest is: " + smallest);
    return largest;
  }

  public static void main(String[] args) {
    int numbers[] = { 1, 2, 3, 4, 6, 23, 5, 10 };
    System.out.println("The largest value is: " + getLargest(numbers));
  }

}
