/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string
 */
export const fakeBin = (x:string):string => {
    let output:string="";
    const arr=(x.split(""));
    arr.forEach((e)=>{
        output += Number(e) < 5 ? "0" : "1";
    })
    return output;
  };