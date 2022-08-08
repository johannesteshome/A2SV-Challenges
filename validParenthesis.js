/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let brackets = [];
    let strArr = s.split('');
    for(let i=0; i<strArr.length; i++){
        if(strArr[i] === '(' ){
            brackets.push('curved');
        }
        else if(strArr[i] === '{'){
            brackets.push('brace');
        }
        else if(strArr[i] === '['){
            brackets.push('square')
        }
        if(strArr[i] === ')' ){
            if(brackets[brackets.length-1] === 'curved'){
                brackets.pop();
            }
            else{
                return false
            }
            
        }
        else if(strArr[i] === '}'){
            if(brackets[brackets.length-1] === 'brace'){
                brackets.pop();
            }
            else{
                return false;
            }
        }
        else if(strArr[i] === ']'){
            if(brackets[brackets.length-1] === 'square'){
                brackets.pop();
            }
            else{ return false}
        }
    }
    
    if(brackets.length !== 0){
        return false
    }
    return true;
};
