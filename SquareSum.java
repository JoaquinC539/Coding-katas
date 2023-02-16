/*Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 12+22+22=91^2 + 2^2 + 2^2 = 91 
2
 +2 
2
 +2 
2
 =9. */
import java.util.Arrays;
public class SquareSum {
    public static int squareSum(int[] n)
    { 
     int Result;
      Result=Arrays.stream(n)
        .map(x->(int)Math.pow(x,2))
        .sum();
      return Result;
    }
}
