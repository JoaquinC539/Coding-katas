/*Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 12+22+22=91^2 + 2^2 + 2^2 = 91 
2
 +2 
2
 +2 
2
 =9.*/
import java.util.Arrays;
public class SumArray {

    public static double sum(double[] numbers) {
      double Result;
        Result=Arrays.stream(numbers)
        .sum();
      return Result;
    }
  }
  