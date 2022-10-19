class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int j = p.length();
        ArrayList<Integer> startingIndices = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> anagramMap = new HashMap<>();
        
        if(p.length() > s.length()) return startingIndices;

        //Mapping the Anagram String
        for(int i=0; i<j; i++){
            anagramMap.put(p.charAt(i), anagramMap.getOrDefault(p.charAt(i), 0) + 1);
        }
        System.out.println(anagramMap);
        
        //Mapping the first substring and checking
        int i=0; int index = i;
        while(i<j){
            // System.out.println("lll");
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if(i == j-1 && map.equals(anagramMap)) startingIndices.add(index);
            i++;
        }
        System.out.println(s.length()-j);
        for(i = index+1; i<=s.length()-p.length(); i++){
            System.out.println(i);
            
            if(map.get(s.charAt(i-1)) == 1){
                map.remove(s.charAt(i-1));
            }
            else{
                map.put(s.charAt(i-1), map.get(s.charAt(i-1)) - 1);
            }
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.equals(anagramMap)) startingIndices.add(i);
            j++;
            System.out.println(map);
        }
        
        return startingIndices;
     }
        
     
}
