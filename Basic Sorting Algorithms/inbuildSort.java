import java.util.Arrays;
import java.util.Collections;

// time complexity - O ( n log n)

public class inbuildSort {

  public static void main(String args[]){
    Integer array[] = {5,4,1,3,2};
    Arrays.sort(array);
    System.out.println("Sorted Array:" + Arrays.toString(array));
    Arrays.sort(array,Collections.reverseOrder());
    System.out.println("Sorted Array:" + Arrays.toString(array));

  }
  
}
