import java.util.*;

// Print the Nth Fibonacci number.

public class fibonacci {
  public static int  printFibonacci(int n){
    if(n == 0 || n == 1){
      return n;
    }
    int printFibonacci = printFibonacci(n-1) + printFibonacci(n-2);
    return printFibonacci;
  }
  public static void main(String[] args) {
    int n = 25;
    int number = printFibonacci(n);
    System.out.println("The " + n + " fibonacci number is: " + number);
  }
}
