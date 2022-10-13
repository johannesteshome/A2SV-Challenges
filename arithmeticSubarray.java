class Solution {
    
    public Boolean isArithmetic(int[] a){
        int n = a.length;
        Arrays.sort(a);
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        
        int d = a[1] - a[0];
        
        for(int i = 1; i < n; i++){
            if(a[i]- a[i-1] != d)return false;
        }
        return true;
    }
    
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> output = new ArrayList<Boolean>();
     
              int n = nums.length;     
        
        for(int i = 0; i < l.length; i++){
            int size = 1 + r[i] - l[i];

            int[] subarray = new int[size];

            int index = 0;
            for(int j = l[i]; j <= r[i]; j++){
                
                subarray[index] = nums[j];
                System.out.println(subarray[index]);
                index++;
            }
            System.out.println();
        
        
            if(isArithmetic(subarray)){
                output.add(true);
            }
            else{
                output.add(false);
            }
        }
     return output;
    }
        
}
