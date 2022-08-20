/**
 * @param {number[]} pushed
 * @param {number[]} popped
 * @return {boolean}
 */
var validateStackSequences = function(pushed, popped) {
    let num = pushed.length;
    let stackArr = [];
    
    let j=0;
    for(let i=0; i<pushed.length; i++){
        stackArr.unshift(pushed[i]);
        while(!(stackArr.length==0) && j < num && stackArr[0]==popped[j]){
            stackArr.shift();
            j++;
        }
    }
    return j == num;
};
