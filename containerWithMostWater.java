class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] position = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right){
            int theSum = numbers[left] + numbers[right];
            
            if(theSum > target){
                right -= 1;
            }
            else if (theSum < target){
                left += 1;
            }
            else{
                position[0] = left+1;
                position[1] = right+1;
                return position;
            }
        }
        return position;
    }
}
