class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            chars[idx] = ch;
            idx++;
            if (count > 1) {
                for (char digit : ("" + count).toCharArray()) {
                    chars[idx] = digit;
                    idx++;
                }
            }
        }
        return idx;
    }
}