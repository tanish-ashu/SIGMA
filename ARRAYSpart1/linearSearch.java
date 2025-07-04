
public class linearSearch {

  public static int search(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = { 1, 4, 6, 7, 8, 9, 0, 4 };
    int key = 1;

    int index = search(numbers, key);
    if (index == -1) {
      System.out.println("NOT found!..");
    } else {
      System.out.println("key is found at index: " + index);
    }

  }

}
