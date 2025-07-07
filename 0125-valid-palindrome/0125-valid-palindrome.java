class Solution {
    public boolean isPalindrome(String s) {

        
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s1.length();
        int st=0; 
        int e=n-1;
        while(st<=e){
            
            if(s1.charAt(st) != s1.charAt(e)){
                return false;
            }
            st++;
            e--;
              

        }
        return true;
        
    }
}