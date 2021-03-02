package com.algorithms.shiraiyuu;

import java.math.BigDecimal;
import java.util.Arrays;

public class Algs1_1_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(Algs1_1.betweenZeroAndOne(in.nextBigDecimal()) && Algs1_1.betweenZeroAndOne(in.nextBigDecimal()));
    }

    public static boolean betweenZeroAndOne(BigDecimal a)
    {
        return BigDecimal.ONE.subtract(a).compareTo(BigDecimal.ZERO) == 1;
    }
}