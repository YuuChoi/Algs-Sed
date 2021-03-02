/*
    Exercise 1.1.14
        A flexible usage of bitwise shift operation <<
        There is no need to implement an arbitrary representation of logarithm here, however it's worth a try
 */


public class Algs1_1_14
{
    public static void main(String[] args)
    {
        System.out.println(lg(8));
    }

    public static int lg(int N)
    {
        int i = 0;
        for(;N!=1;N=N>>1)i++;
        return i;
    }
}
