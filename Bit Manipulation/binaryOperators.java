import java.util.*;

public class binaryOperators {
  public static void main(String[] args) {
    // AND Operator
    System.out.println((5&6));
    // OR Operator
    System.out.println((5|6));
    // XOR Operator
    System.out.println((5^6));
    // NOT Operator
    System.out.println((!true));  
    // Binary One's Complement 
    System.out.println((~5)); // to convert a negative number to binary, we take 2's complement.  // ~0 == -1 
    
    
    /* numbers mein jab  0 - 1 se convert ho rha hai 
    1 - 0 se covert ho rha hai too..
    negative no - positive convert ho jate hai
    positive no - negative convert ho jate hai   ?
    
    */
    
    // Binary Left Shift
    System.out.println((5<<2));  // (a<<b = a*2^b)
    
    // Binary Right Shift
    System.out.println((6>>1));  // (a<<b = a*2^b)


  }
}
