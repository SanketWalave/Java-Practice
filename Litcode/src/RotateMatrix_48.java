import java.util.*;

public class RotateMatrix_48 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//                new int[4][4];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("===================");
        rotate(a);

    }

    public static void rotate(int[][] matrix) {
        int n=matrix.length;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i; j < matrix.length; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//
//
//
//        }
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                c++;
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix.length; l++) {
                        System.out.print(matrix[k][l]);//+"("+l+","+k+")");
                    }
                    System.out.println();
                }
                System.out.println("\n================ "+c);
            }

        }
    }
}

