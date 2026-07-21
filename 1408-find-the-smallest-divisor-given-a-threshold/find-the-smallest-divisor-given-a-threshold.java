class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low=1;
        int high=0;
        for(int i : nums){
            high=Math.max(high,i);
        }
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(smallestdivisor(nums,mid,threshold)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean smallestdivisor(int[] nums, int mid, int threshold){
        int divisorsum=0;
        for(int i : nums){
            divisorsum+=(i+mid-1)/mid;
        }
        return divisorsum<=threshold;
    }
}