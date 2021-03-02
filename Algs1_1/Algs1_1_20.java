/*
    Exercise 1.1.20
 */

import java.lang.Math;

public class Algs1_1_20
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 10; i++)
        System.out.println(i + " " + lnFac(i));
    }

    public static double lnFac(int N)
    {
        if(N == 1) return 0;
        return Math.log(N)+lnFac(N-1);
    }
}

