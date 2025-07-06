import java.util.*;

public class reverseArray {
  public static void funReverseArray(int numbers[]) {
    int first = 0;
    int last = numbers.length - 1;

    while (first < last) {
      int temp = numbers[last];
      numbers[last] = numbers[first];
      numbers[first] = temp;

      first++;
      last--;

    }
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 3, 5, 6 };

    System.out.println("The original arry is:" + Arrays.toString(numbers));
    funReverseArray(numbers);
    System.out.println("The reversed arry is:" + Arrays.toString(numbers));
  }

}
