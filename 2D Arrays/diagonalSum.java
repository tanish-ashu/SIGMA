import java.util.*;

public class diagonalSum {
  public static void diagonalSum1(int[][] matrix){   // O(n^2)
    int sum = 0;
    for(int i = 0; i<matrix.length; i++){
      for(int j = 0; j<matrix.length; j++){
        if(i==j){                             // primary diagonal
          sum+= matrix[i][j];
        }else if(i+j == matrix.length-1){     // secondary diagonal
          sum+= matrix[i][j];
        }
      }
    }
    printMatrix(matrix);
    System.out.println("The diagonal Sum is:" + sum);
  }

    public static void diagonalSumOptimized(int[][] matrix){  // O(n)
      int sum = 0;
      for( int i=0; i<matrix.length; i++){
        sum += matrix[i][i];
        if(i != matrix.length -1 -i){
          sum+= matrix[i][matrix.length -1 -i];
        }
      }
            System.out.println("The Optimized sum is: " + sum);
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
      int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                       };
      diagonalSum1(matrix);
      diagonalSumOptimized(matrix);
    }
  
}
