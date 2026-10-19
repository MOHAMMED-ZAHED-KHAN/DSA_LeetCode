class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                word.append(ch);
            }
            else{
                res.append(word.reverse());
                res.append(ch);
                word.setLength(0);
            }
        }
        res.append(word.reverse());
        return res.toString();
    }
}