/*
    Exercise 1.1.18
        The answer is 50, 33.
 */

public class ALgs1_1_18
{
    public static void main(String[] args)
    {
        System.out.println(mystery(2,25));
        System.out.println(mystery(3,11));
        System.out.println(mysteryP(2,25));
        System.out.println(mysteryP(3,11));
    }

    public static int mystery(int a, int b)
    {
        if(b == 0) return 0;
        if(b % 2 == 0) return mystery(a+a,b/2);
        return mystery(a+a,b/2) + a;
    }
    public static int mysteryP(int a, int b)
    {
        if(b == 0) return 1;
        if(b % 2 == 0) return mysteryP(a*a,b/2);
        return mysteryP(a*a,b/2) * a;
    }
}
