/*
    Exercise 1.1.16
 */


public class Algs1_1_16
{
    public static void main(String[] args)
    {
        System.out.print(exR1(6));
    }

    public static String exR1(int n)
    {
        if(n<=0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

}
