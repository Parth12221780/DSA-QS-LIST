class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
                char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
        for(int i=0; i<n; i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;



        
    }
}