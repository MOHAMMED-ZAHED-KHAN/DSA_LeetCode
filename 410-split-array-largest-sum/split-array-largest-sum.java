class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low=0;
        int high=0;
        for(int i : nums){
            low=Math.max(low,i);
            high+=i;
        }
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(minlargestsplit(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean minlargestsplit(int[] nums , int mid ,int k){
        int nofsplit=1;
        int subarraysum=0;
        for(int i : nums){
            if((subarraysum+i)>mid){
                nofsplit++;
                subarraysum=i;
            }else{
                subarraysum+=i;
            }
        }
        return nofsplit<=k;
    }
}