import java.util.*;

// why string are immutable and its effect on program -> using string builder.


public class stringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a'; ch<= 'z'; ch++){
      sb.append(ch);
      // O(26)
      // if used String // O(n^2);
    }
    System.out.println(sb.getClass());
    System.out.println(sb);
    String sb2 = sb.toString();
    System.out.println(sb2.getClass());
    System.out.println(sb);
  }
  
}
