class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int[] numsBit = new int[nums.length];
        HashMap <Integer, Integer> map = new HashMap<> ();
        map.put(0, 1);
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                numsBit[i] = 0;
            }
            else{
                numsBit[i] = 1;
            }
        }
        
        for(int i=0; i<numsBit.length; i++){
            sum += numsBit[i];
            if(map.containsKey(sum-k))
                count += map.get(sum-k);
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
