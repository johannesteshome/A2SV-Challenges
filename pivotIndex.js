/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let sum = 0;
    let leftSum = 0;
    
    for(let x of nums) sum+=x;
    for(let i=0; i<nums.length; ++i){
        if(leftSum == sum - leftSum - nums[i]) return i;
        leftSum+=nums[i];
    }
    return -1;
};
