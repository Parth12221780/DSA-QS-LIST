class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int n=letters.length;
        int e=n-1;
        char ans = letters[0];
        while(s<=e){
            int mid=s+(e-s)/2;
            // if(letters[mid]==target){
            //     return target;
            // }
            if(letters[mid]-'0'>target-'0'){
                ans=letters[mid];
                e=mid-1;
                
                

            }
            else if(letters[mid]-'0'<=target-'0'){
                // ans=letters[mid];
                s=mid+1;
            }
        }
        return ans;
        
    }
}