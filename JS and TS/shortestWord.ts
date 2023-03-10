/**
 * Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */
export function findShort(s: string): number {
    let result:number=80;
    s.split(" ").forEach((e:string)=>{
        if(e.length<result){
            result=e.length;
        }
    });
    return result;
  }