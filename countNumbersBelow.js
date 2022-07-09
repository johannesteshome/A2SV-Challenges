/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    let count = [];
    
    for(let i=0; i<nums.length; i++){
        let countNum = 0;
        for(let j=0; j<nums.length; j++){
            
            if(nums[i] != nums[j] && nums[i]>nums[j]){
                countNum++;
                
            }
        }
                    count[i] = countNum;

    }
    
    return count;
};
