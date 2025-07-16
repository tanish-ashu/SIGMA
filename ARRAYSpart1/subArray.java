import java.util.*;

class Main {
    
public static void printSubArray(int numbers[]){
    int start;
    int end;
    int countSubArray = 0;
    for(start=0; start<numbers.length; start++){
        for(end=start; end<numbers.length; end++)
        {
            for(int k = start; k<=end; k++){
                System.out.print(numbers[k] + " ");
                countSubArray++;
            }
            System.out.println();
        }
        System.out.println();
    }

}
    
    
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
        
    }
}