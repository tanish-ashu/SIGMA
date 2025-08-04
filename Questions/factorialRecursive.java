import java.util.*;

public class factorialRecursive {
  public static int factorial(int n){
    if(n==1){
      return 1;
    }
    int factorial = n * factorial(n-1);
    return factorial;
  }


  public static void main(String[] args) {
    int n = 5;
    System.out.println(factorial(n));
    
  }
  
}
