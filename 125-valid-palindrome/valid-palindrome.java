class Solution {
    public boolean isPalindrome(String s) {
        // String ss = s.toLowerCase().replaceAll("[^a-z0-9]","");
        // for(int i=0;i<ss.length()/2;i++){
        //     char left = ss.charAt(i);
        //     char right = ss.charAt(ss.length()-1-i);
        //     if(left!=right){
        //         return false;
        //     }
        // }
        // return true;
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}