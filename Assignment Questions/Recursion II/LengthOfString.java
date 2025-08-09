import java.util.*;

public class LengthOfString {
  public static int lengthOf(String str){
    if(str.equals("")){
      return 0;
    }
    return 1 + lengthOf(str.substring(1));
  }

  public static void main(String[] args) {
    String str = "Tanishk Rajak";
    System.out.println(lengthOf(str));
  } 
}
