import java.util.*;

public class printNumInStr {
  public static void getInStr(String Map[], StringBuilder result, int number){
    if(number<=0){
      return;
    }
    int num = number % 10;
    getInStr(Map, result, number/10);
    result.append(Map[num]);
  }

  public static void main(String[] args) {
    int number = 1947;
    String Map[] = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
    StringBuilder result = new StringBuilder("");
    getInStr(Map, result, number);
    System.out.println(result);
    
  }
  
}
