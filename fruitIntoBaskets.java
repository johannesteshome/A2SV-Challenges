class Solution {
    public int totalFruit(int[] fruits) {
        ArrayList<Integer> al = new ArrayList<Integer>(2); //basket
        int max = 0;
        int count = 1;
        boolean occuredOnce = false;
        
        if(fruits.length == 1){
            return 1;
        }
        
        for(int i = 0; i < fruits.length - 1 && fruits.length - (i + 1) >= max; i++){
            // System.out.println("firstIteration");
            al.add(fruits[i]);
            int j = i+1;
            while(j<fruits.length){
                if(al.contains(fruits[j])){ 
                    count++;
                    max = Math.max(max, count);
                    // System.out.println("if");
                }
                else{
                    if(!occuredOnce){
                        al.add(fruits[j]);
                        count++;
                        occuredOnce = true;
                        max = Math.max(max, count);
                        // System.out.println("else.. if");
                    }
                    else{
                        occuredOnce = false;
                        max = Math.max(max, count);
                        count = 1;
                        al.clear();
                        // System.out.println("else.. if else");
                        break;
                    }
                    
                }
                // System.out.println(max);
                // System.out.println(al);
               // count = 1;
                if(j == fruits.length - 1){
                    al.clear();
                    occuredOnce = false;
                    count = 1;
                }
                j++;
            }
        }
        
        return max;
    }
}
