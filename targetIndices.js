/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var targetIndices = function(nums, target) {
    for(let i = 0; i < nums.length; i++){
    
   for(let j = 0; j < ( nums.length - i -1 ); j++){
    
     if(nums[j] > nums[j+1]){
       var temp = nums[j]
       nums[j] = nums[j + 1]
       nums[j+1] = temp
     }
   }
 }
    
    let targets = [];
    
    for(let i=0; i<nums.length; i++){
        if(nums[i] == target){
            targets.push(i);
        }
    }
    
    return targets;
};
