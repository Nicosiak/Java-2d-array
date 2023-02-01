
public class twodarray {

	public static void main(String[] args) {
		

	int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
					    int rowSum, colSum, diaSum1, diaSum2;

					    // Print the numbers in the matrix
					    for (int i = 0; i < 4; i++) {
					      for (int j = 0; j < 4; j++) {
					        System.out.print(array[i][j] + " ");
					      }
					      System.out.println();
					    }

					    System.out.println();

					    // Calculate row sum
					    for (int i = 0; i < 4; i++) {
					      rowSum = 0;
					      for (int j = 0; j < 4; j++) {
					        rowSum += array[i][j];
					      }
					      System.out.println("Row " + (i + 1) + " sum: " + rowSum);
					    }
					    
					    System.out.println();

					    // Calculate column sum
					    for (int j = 0; j < 4; j++) {
					      colSum = 0;
					      for (int i = 0; i < 4; i++) {
					        colSum += array[i][j];
					      }
					      System.out.println("Column " + (j + 1) + " sum: " + colSum);
					    }
					    
					    System.out.println();

					    // Calculate diagonal sum 1
					    diaSum1 = 0;
					    for (int i = 0; i < 4; i++) {
					      diaSum1 += array[i][i];
					    }
					    System.out.println("Diagonal 1 sum: " + diaSum1);

					    // Calculate diagonal sum 2
					    diaSum2 = 0;
					    for (int i = 0; i < 4; i++) {
					      diaSum2 += array[i][3-i];
					    }
					    System.out.println("Diagonal 2 sum: " + diaSum2);
					  }
}
