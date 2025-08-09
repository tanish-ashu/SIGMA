import java.util.*;

public class isAnagrams {
  public static boolean isAnagrams(String str1, String str2){
    if(str1.length() != str2.length()){
      return false;
    }
    int match = 0;
    for(int i = 0 ; i< str1.length(); i++){
      for(int j = 0; j< str1.length(); j++){
        if(str1.charAt(i) == str2.charAt(j)){
          match++;
        }
      }
    }
    if(match == str1.length()){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    String str1 = "race";
    String str2 = "care";

    System.out.println(isAnagrams(str1, str2));

  }
  
}
