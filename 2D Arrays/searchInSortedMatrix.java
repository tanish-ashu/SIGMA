import java.util.*;

public class searchInSortedMatrix {
    public static boolean stairCaseSearch(int[][] matrix, int key){
      int row = 0;
      int column = matrix[0].length-1;
      while(row<matrix.length && column>=0){
        if(key == matrix[row][column]){
          return true;
        }else if(key > matrix[row][column]){
          row++;
        }else{
          column--;
        }
      }
      return false;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); 
        }
        System.out.println("-----------------");
    }

    public static void main(String args[]){
      int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                       };
      int key = 39;
     // rowWiseBinarySearch(matrix);
      System.out.println("The key found is : " + stairCaseSearch(matrix, key));
      
    }
  
}
