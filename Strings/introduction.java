import java.util.*;

public class introduction {

  public static void printLetters(String str){
    for(int i = 0; i<str.length(); i++){
      System.out.print(str.charAt(i) + " " );
    }
  }
    public static void main(String args[]){
      char arr[] = {'a', 'b', 'c', 'd'};
      String str = "abcd";
      String str2 = new String("xyz");

      // strings are IMMUTABLE


      // Input / Output 
      Scanner sc = new Scanner(System.in);
      String name;
      name = sc.nextLine(); // sc.next(); takes single word
      System.out.println(name);

      // length function
      String fullName = "Abhishek Raikwar";
      System.out.println(fullName.length());

      // Concatenation
      String firstName = "Tanihsk";
      String lastName = "Rajak";
      String fullName2 = firstName + " " + lastName;
      System.out.println(fullName);
      System.out.println(fullName.charAt(4));

      printLetters(fullName);
    }
}
