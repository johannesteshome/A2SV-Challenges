class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int start = 0; 
        int end = start + (cardPoints.length - k);
         int sum = 0;
            for(int i=end; i<cardPoints.length; i++)
                sum += cardPoints[i];
        max = sum;
        
        while(end < cardPoints.length){
           sum += (cardPoints[start] - cardPoints[end]);
            if(sum > max) max = sum;
             start++; end++;   
            
                
            
            
        }
        return max;
    }
}
