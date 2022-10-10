class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            int remain = limit - people[right];
            right -= 1;
            boats += 1;
            
            if(left<=right && remain >= people[left]){
                left += 1;
            }
        }
        return boats;
    }
}
