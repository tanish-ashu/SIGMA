import java.util.*;

public class shortestPathQuestion {
  public static double displacement(String str){
    int x = 0;
    int y = 0;
    for( int i = 0; i<str.length()-1; i++){
      char dir = str.charAt(i);
      if(dir == 'E'){
        x++;
      }else if(dir == 'W'){
        x--;
      }else if(dir == 'N'){
        y++;
      }else{
        y--;
      }
    }
    // calculating displacement with formula
    int x2 = x*x;
    int y2 = y*y;
    return Math.sqrt(x2+y2);
  }

  public static void main(String[] args){
    String str = "WNEENESENNN";
    System.out.println("The shorted path after the travel is:" + displacement(str));

  }
  
}
