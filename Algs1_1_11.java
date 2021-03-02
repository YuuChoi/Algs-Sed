package com.algorithms.shiraiyuu;

import java.math.BigDecimal;
import java.util.Arrays;

public class Algs1_1_11
{
    public static void main(String[] args)
    {
        ;
    }

    public static String boolToString(boolean[][] arr)
    {
        var str = new StringBuilder();
        str.append("  ");
        for(int i=0;i<rowMaxLen(arr);i++) str.append(i+" "); str.append("\n");
        int rowNumber = 0;
        for(boolean[] row : arr)
        {
            str.append(rowNumber+" "); rowNumber++;
            for(boolean b : row) str.append(b?"* ":"- ");
            str.append("\n");
        }
        return str.toString();
    }

    private static int rowMaxLen(boolean[][] arr)
    {
        int max=0;
        for(int i=0;i<arr.length-1;i++) max = Math.max(arr[i].length,arr[i+1].length);
        return max;
    }
}