import java.util.*;

public class spiralMatrix {
  public static void printSpiral(int matrix[][]){
    int startRow = 0;
    int endRow = matrix.length-1;
    int startColumn = 0;
    int endColumn = matrix[0].length-1;
    while(startRow <= endRow && startColumn <= endColumn){
      // print top border
      for(int i = startColumn; i<= endColumn; i++){
        System.out.print(matrix[startRow][i] + " ");
      }
      // print right border
      for(int i = startRow + 1; i<= endRow; i++){
        System.out.print(matrix[i][endColumn] + " ");
      }
      // print bottom border
      for(int i = endColumn-1; i>= startColumn; i--){
        if(startRow == endColumn){
          break;
        }
        System.out.print(matrix[endRow][i]  + " " );
      }
      // print left border
      for(int i = endRow-1; i> startRow+1; i--){
        if(startColumn == endColumn){
          break;
        }
        System.out.print(matrix[i][startColumn] + " ");
      }

      startRow++;
      endRow--;
      startColumn++;
      endColumn--;
    }
    
  }

  public static void main(String [] args){
    int matrix [][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    System.out.println("Printing Spiral Matrix:");
    printSpiral(matrix);
  }
  
}
