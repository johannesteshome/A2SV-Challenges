class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;
        int[] output = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            output[i] = prefix;
            prefix *= nums[i];
        }
        
        for(int j=nums.length-1; j>=0; j--){
            output[j] = output[j] * postfix;
            postfix = postfix * nums[j];
        }
        
        return output;
        
    }
}
