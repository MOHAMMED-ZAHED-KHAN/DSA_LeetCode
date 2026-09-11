class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpoint=-1;
        for(int i =n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breakpoint=i;
                break;
            }
        }
        if(breakpoint==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>breakpoint;i--){
            if(nums[i]>nums[breakpoint]){
                int temp = nums[i];
                nums[i]=nums[breakpoint];
                nums[breakpoint]=temp;
                break;
            }
        }
        reverse(nums,breakpoint+1,n-1);
    }
    public void reverse(int[] nums , int low , int high){
        while(low<=high){
            int temp = nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
        }
    }
}
