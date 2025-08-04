import java.util.*;

public class recursionPrintdec {
  public static void printDec(int n){
    if(n==0){
      return;
    }
    System.out.println(n);
    printDec(n-1);
  }

  public static void printAec(int n){
    if(n==0){
      return;
    }
    printAec(n-1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    int n = 5;
    printAec(n);
    System.out.println();
    printDec(n);
  }
  
}
