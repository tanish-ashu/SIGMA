import java.util.*;

public class sumofFirstNnaturalNumber {
  public static int sum(int n){
    if(n == 1){
      return 1;
    }
    int sum = n + sum(n-1);
    return sum;
  }

  public static void main(String[] args) {
    int number = 5;
    int sum = sum(number);
    System.out.println("The sum of first " + number + " natural number is: " + sum);
  }
}
