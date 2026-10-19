class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }else if (word.equals(word.toLowerCase())){
            return true;
        }else if (Character.isUpperCase(word.charAt(0))){
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}