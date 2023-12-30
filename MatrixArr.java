package MatrixArr;
import java.util.*;
public class MatrixArr {
    public static void main(String[] args) {
        int[][] Matrix1 ={
            {6,8,7},
            {5,8,4},
            {8,9,9}
        };
        int[][] Matrix2 ={
            {2,5,1},
            {7,8,6},
            {2,9,9}
        };
        int[][] jumlah = new int [Matrix1.length][Matrix1[0].length];
        for (int i = 0; i < Matrix1.length; i++) {
            for (int j = 0; j < Matrix1[0].length; j++) {
                jumlah [i][j] = Matrix1[i][j] * Matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(jumlah));
        
    }
}     
  
