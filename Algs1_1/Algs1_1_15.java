/*
    Exercise 1.1.15
 */

import java.util.Arrays;

public class Algs1_1_15
{
    public static void main(String[] args)
    {
        int[] iArr = {0,1,2,1,2,2};
        System.out.println(Arrays.toString(histogram(iArr,3)));
    }

    public static int[] histogram(int[] a, int M)
    {
        int[] his = new int[M];
        for (int j:a) if(j<M)his[j]++;
        return his;
    }
}
