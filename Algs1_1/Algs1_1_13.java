/*
  Exercise 1.1.13
 */

import java.util.Arrays;

public class Algs1_1_13
{
    public static void main(String[] args)
    {
        int[][] iArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(Arrays.deepToString(transposeMatrix(iArr)));
    }

    public static int[][] transposeMatrix(int[][] mat)
    {
        int[][] transMat = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                transMat[j][i] = mat[i][j];

        return transMat;
    }
}