class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
	    int sum = 0;
 
	    int i = 0;
        int index = 0;
	    int j = k-1;
	
	while(j<arr.length){
		while(i<=j){
			sum+=arr[i];  
			i++;
		}
		
		if(sum/k >= threshold) count++;
		sum =0;
		j+=1; i=index+1; index = i;
}

return count;

    }
}
