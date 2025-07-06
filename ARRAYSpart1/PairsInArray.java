// maximum of two numbers pairs we can make without repeating (printing)
import java.util.*;

public class PairsInArray {
  public static void printPairs(int numbers[]){
    int numPairs = 0;
    for(int i=0; i<numbers.length; i++){
      int curr = numbers[i];
      for(int j=i+1; j<numbers.length; j++){
        System.out.print("(" + curr + "," + numbers[j] + ')' + ' ');
        numPairs++;
      }
      System.out.println();
    }
    System.out.println("Total number of pairs got: " + numPairs);
}


  public static void main(String[] args) {
    int numbers[] = {1,2,3,4,5};
    System.out.println("The paris of" + Arrays.toString(numbers) + "are:");
    printPairs(numbers);
    
  }
}

// pairs -> n(n-1)/2 
// time complexity -> O(n2)
