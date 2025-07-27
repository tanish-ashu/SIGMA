import java.util.*;

// f(n) = n * f(n-1);

public class printFactorial {
  public static int getFactorial(int n){
    if(n==0){
      return 1;
    }
    int fact = getFactorial(n-1);
    int fn = n * getFactorial(n-1);
    return  fn;
  }
  public static void main(String[] args) {
    int number = 5;
    int factorial = getFactorial(number);
    System.out.println("The factorial of " + number + " is: " + factorial);
  }
}
