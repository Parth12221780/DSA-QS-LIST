class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(hm.containsKey(ch1)){
                if(hm.get(ch1) != ch2){
                    return false;
                }
            }else{
                hm.put(ch1, ch2);
            }

            if(hm1.containsKey(ch2)){
                if(hm1.get(ch2) != ch1){
                     return false;
                }
            }else{
                                                                                                                hm1.put(ch2, ch1);
                                                                                                            }

        
            

            
        }
        return true;
}
    }

