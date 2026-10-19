class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int i=0;
        while(i<chars.length){
            int count=0;
            char ch = chars[i];
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            chars[idx++]=ch;
            if(count>1){
                for(char digit: (""+count).toCharArray()){
                    chars[idx++]=digit;
                }
            }
        }
        return idx;
    }
}