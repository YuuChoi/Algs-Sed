/*
  Exercise 1.1.5
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Algs1_1_5
{
    public static void main(String[] args)
    {
        System.out.println("Input 2 decimals for testing:");
        Scanner in = new Scanner(System.in);
        System.out.println(betweenZeroAndOne(in.nextBigDecimal()) && betweenZeroAndOne(in.nextBigDecimal()));
    }

    public static boolean betweenZeroAndOne(BigDecimal a)
    {
        return BigDecimal.ONE.subtract(a).compareTo(BigDecimal.ZERO) == 1;
    }
}