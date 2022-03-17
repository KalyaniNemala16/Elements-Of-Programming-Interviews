import java.util.*;

public class CountNumberOFWaysToTraverse2DArray {
public static int countNumberOfWays(int rows, int cols) {
    if(rows == 0 || cols == 0) return 0;
    int[][] arr = new int[rows][cols];
    arr[0][0] = 1;
    for(int i = 0 ; i < rows ; i++) {
        for(int j = 0 ; j < cols ; j++) {      
                int x = (i-1 >= 0) ? arr[i-1][j] : 0;
                int y = (j-1 >= 0) ? arr[i][j-1] : 0;
                if(arr[i][j] == 0) arr[i][j] = x + y;
        }
    }
return arr[rows-1][cols-1];
}
    public static void main(String args[]) {     
        System.out.println(countNumberOfWays(5,5));
}
}