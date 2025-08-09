import java.util.*;

public class vowelsInString {
  public static int vowelCount(String str, char Map[]){
    int vowelsCount = 0;
    for(int i = 0; i< str.length(); i++){
      for(int j = 0; j< Map.length; j++){
        if(str.charAt(i) == Map[j]){
          vowelsCount ++;
        }
      }
    }
    return vowelsCount;
  }

  public static void main(String[] args) {
    String str = "Tanishk Rajak";
    char Map[] = {'a' ,'e', 'i', 'o', 'u'};

    int output = vowelCount(str, Map);
    System.out.println(output);
  }
  
}
