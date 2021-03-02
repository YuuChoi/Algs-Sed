/*
    Exercise 1.1.19
        System.currentTimeMillis() is used for run time calculating.
        F() is the implementation on the textbook, enhanceF() is the improved one.
        F(40) takes 417ms to run on my PC, while F(50) takes 51058ms;
        However, enhanceF(500) still takes less than 1ms.

        • Implementation by recursion saves space at the cost of time.
 */

import java.math.BigInteger;

public class Algs1_1_19
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        System.out.println(enhanceF(500));

        long duration = System.currentTimeMillis() - start;
        System.out.println("Running time: "+duration+" milliseconds");
    }

    public static long F(int N)
    {
        if(N==0)return 0;
        if(N==1)return 1;
        return F(N-1) + F(N-2);

    }

    public static BigInteger enhanceF(int N)
    {
        BigInteger[] F = new BigInteger[N+1];
        F[0]=BigInteger.ZERO;F[1]=BigInteger.ONE;
        for(int i = 2;i < N+1;i++)F[i]=F[i-1].add(F[i-2]);
        return F[N];
    }
}
