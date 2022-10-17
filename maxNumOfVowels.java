class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int index = i;
        int j = k-1;
        int count = 0;
        int max = 0; 
        int[] vowelBits = new int[s.length()];
        
        for(int a=0; a<s.length(); a++){
            if(s.charAt(a) == 'a' || s.charAt(a) == 'e' || s.charAt(a)  == 'i' || s.charAt(a) == 'o' || s.charAt(a) == 'u'){
                vowelBits[a] = 1;
            }
            else vowelBits[a] = 0;
        }
        

        
        
        while(j<vowelBits.length){
            while(i<=j){
                count += vowelBits[i];
                i++;
            }
            if(max<count) max = count;
            count = 0; 
            i = index + 1; index = i; j++;
        }
        
        return max;
        
    }
}
