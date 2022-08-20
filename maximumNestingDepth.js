/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    let strArr = s.split("");
    let count = 0;
    let countArr = [];
    // let stackArr = [];
    for(let i=0; i<strArr.length; i++){
        if(strArr[i] === '(' ){
            // stackArr.push( '(' );
            countArr.push(++count);
        }
        else if(strArr[i] === ')' ){
            // stackArr.push( ')' );
            countArr.push(--count);
        }
    }
    
    let largestNum = 0;

    for(let i=0; i<countArr.length; i++){
        if(largestNum<countArr[i]){
            largestNum = countArr[i];
        }

     
    }
    return largestNum;
};
