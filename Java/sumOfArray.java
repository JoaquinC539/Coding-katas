/*Task
Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).

The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.

Mind the input validation.

Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6 
Input validation
If an empty value ( null, None, Nothing etc. ) is given instead of an array, 
or the given array is an empty list or a list with only 1 element, return 0.
*/
//First Solution with less lines
import java.util.Arrays;
import java.util.IntSummaryStatistics;
public class sumOfArray{
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();
        return (int) stats.getSum()-stats.getMax()-stats.getMin();
    }
}
/* Second solution
public class sumOfArray {
    public static int sum(int[] numbers)
    {
        int result=0;
        if(numbers instanceof int[] && numbers!=null &&numbers.length>1){
            int maxNumber=Arrays.stream(numbers).max().getAsInt();
            int minNumber=Arrays.stream(numbers).min().getAsInt();
            result=Arrays.stream(numbers).sum()-maxNumber-minNumber;
            return result;
        }else{return result;}    
    }
}
*/
