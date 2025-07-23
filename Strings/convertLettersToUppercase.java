import java.util.*;

// character.toUppercase()

public class convertLettersToUppercase {
  // try1
  public static StringBuilder convert(StringBuilder str){
    StringBuilder str2 = new StringBuilder("");
    char prev = ' ';
    for( int i= 0; i<str.length(); i++){
      if(prev == ' '){
        str2.append(Character.toUpperCase(str.charAt(i)));
      }else{
        str2.append(str.charAt(i));
      }
      prev = str.charAt(i);
    }
    return str2;
  }

  // try2
  public static void convert2(StringBuilder str){
    int prev = 0;
    for(int ch = 0; ch<str.length(); ch++){
      
      if(prev == 0){
       str.setCharAt(ch,Character.toUpperCase(str.charAt(ch)));
       prev = 1;
      }else{
        str.setCharAt(ch, str.charAt(ch));
      }
      if(str.charAt(ch) == ' '){
        prev = 0;
      }
    }
  }

  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("hi, i am tanishk");
    System.out.println(convert(str));
    convert2(str);
    System.out.println(str);
  }
}
