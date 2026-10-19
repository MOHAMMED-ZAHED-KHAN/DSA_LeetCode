class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int left = i;
                int right = j;
                boolean isPalindrome = true;
                while(left<right){
                    if(s.charAt(left)!=s.charAt(right)){
                        isPalindrome=false;
                    }
                    left++;
                    right--;
                }
                if(isPalindrome){
                    count++;
                }
            }
        }
        return count;
    }
}