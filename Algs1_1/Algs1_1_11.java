/**
    Exercise 1.1.11 on P56(ENG), P34(CN)
        To be clear, hyphen - is used for false value output.
 */

public class Algs1_1_11
{
    public static void main(String[] args)
    {
        boolean[][] bArr = {{true,false,true,false,true},{false,true,false,true},{true,false,true},{false,true},{true}};
        System.out.println(boolToString(bArr));
    }

    public static String boolToString(boolean[][] arr)
    {
        // Print table headers
        var str = new StringBuilder();
        str.append("  ");
        for(int i=0;i<rowMaxLen(arr);i++)
        {
            str.append(i);
            str.append(" ");
        }
        str.append("\n");

        int rowNumber = 0;
        for(boolean[] row : arr)
        {
            str.append(rowNumber); str.append(" "); rowNumber++;

            for(boolean b : row) str.append(b?"* ":"- ");
            str.append("\n");
        }
        return str.toString();
    }

    private static int rowMaxLen(boolean[][] arr)
    {
        int maxV =0;
        for (boolean[] booleans : arr) maxV = Math.max(maxV, booleans.length);
        return maxV;
    }
}