class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int maxlen=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int ele : set){
            if(!set.contains(ele-1)){
                int count =1;
                int x = ele;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                maxlen=Math.max(maxlen,count);
            } 
        }
        return maxlen;
    }
}