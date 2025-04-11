class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character ,Integer> hm = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<m; i++){
            char ch = t.charAt(i);
            if(!hm.containsKey(ch)){
                return false;
            }
            
            hm.put(ch, hm.get(ch) - 1);
            if(hm.get(ch)<0){
                return false;
            }
                                            
        }
        
        return true;
        
    }
}