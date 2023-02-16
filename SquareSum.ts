"use strict"
/*Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 12+22+22=91^2 + 2^2 + 2^2 = 91 
2
 +2 
2
 +2 
2
 =9.*/
export function squareSum(numbers:number[]):number{
    let result=0;
    let initialValue=0;
    result=numbers.reduce((previousValue,currentVal)=>{
      return previousValue+(currentVal**2);
    },initialValue)
      return result;
    
}

