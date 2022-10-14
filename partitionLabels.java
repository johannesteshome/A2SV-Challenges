class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int end = 0;
        int size = 0;
        List<Integer> output = new ArrayList<Integer>();
        
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), i);
            }
            else{
                map.put(s.charAt(i), i);
            }
        }
        System.out.println(map);
        
        int index = 0;
        
        for(int i=0; i<s.length(); i++){
           
            if(map.get(s.charAt(i)) > end){
                end = map.get(s.charAt(i));
            }
            if(i == end){
                output.add(size+1);
                size = 0;
                continue;
            }
            size++;
        }
        return output;
    }
}
