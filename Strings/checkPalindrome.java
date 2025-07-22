import java.util.*;

public class checkPalindrome {
  public static boolean check(String str){
    int n = str.length();
    for(int i = 0; i<(n-1)/2; i++){ // or n/2 whats the difference
      if(str.charAt(i) != str.charAt(n-1-i)){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    String str = "racecar";
    String str2 = "tanuj";
    System.out.println(check(str));
    System.out.println(check(str2));
  }
  
}
