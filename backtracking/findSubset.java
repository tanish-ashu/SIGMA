public class findSubset {

  public static void printSubsets(String str, String ans, int idx){
    // base case
    if (idx == str.length()){
      System.out.println(ans);
      return;
    }

    // yes choice / recursion
    printSubsets(str, ans + str.charAt(idx), idx+1);

    // no choice / backtrackingṇ
    printSubsets(str, ans, idx+1);
  }

  public static void main(String args[]){
    String str = "abc";
    String ans = "";
    printSubsets(str,ans,0);
    
  }
  
}
