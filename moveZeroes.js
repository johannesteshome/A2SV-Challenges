/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let arrLength = nums.length;
    let position = [];
  
    let posCount = 0;
    
    
    for(let i=0; i<arrLength; i++){
        if(nums[i] == 0){
           // nums.splice(i, 1);
            nums.push(0);
        }
    }
    
  
    for(let i=0; i<arrLength; i++){
        if(nums[i] == 0){
           position.push(i);
        }
    }
    
    for(let i=0; i<position.length; i++){
        nums.splice(position[i]-posCount, 1);
        posCount++;
    }
        
  
    
};
