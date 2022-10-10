class Solution {
    public void rotate(int[] nums, int k) {
        
        int[] newArr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(i+k < nums.length)
                newArr[i+k] = nums[i];
            else
                newArr[(i+k)%nums.length] = nums[i];
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = newArr[i];
        }
        
        
    }
}
