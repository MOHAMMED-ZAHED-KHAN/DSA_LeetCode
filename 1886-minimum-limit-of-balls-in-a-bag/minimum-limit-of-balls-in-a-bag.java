class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        int low=1;
        int high=0;
        for(int i : nums){
            high=Math.max(high,i);
        }
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(miniballs(nums,mid,maxOperations)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        // return low;
    }
    public boolean miniballs(int[] nums , int mid , int maxOperations){
        long operations=0;
        for(int i : nums){
            operations+=((i+mid-1)/mid)-1;
        }
        return operations<=maxOperations;
    }
}