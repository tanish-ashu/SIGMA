import java.util.*;

public class factorialRecursion {
  public static int fabonacci(int n){
    if(n == 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    int fabonaccii = fabonacci(n-1) + fabonacci(n-2);

    return fabonaccii;
  }
  public static void main(String[] args) {
    int n = 8;
    System.out.println(fabonacci(n));
  }
}
