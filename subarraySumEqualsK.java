class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum[] = new int[nums.length+1];
        prefixSum[0] = 0;
        int count = 0;
       
        for (int i = 0; i < nums.length; i++)
            prefixSum[i+1] = prefixSum[i] + nums[i];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k)
                count++;
        }
        
        for(int i=1; i<prefixSum.length; i++){
            for(int j=i+1; j<prefixSum.length; j++){
                   
                        if(prefixSum[j] - prefixSum[i-1] == k){
                            count++;
                        }
                
                }
            
        }
        
        return count;
    }
}
