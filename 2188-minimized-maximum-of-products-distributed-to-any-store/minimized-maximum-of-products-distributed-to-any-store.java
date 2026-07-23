class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int m = quantities.length;
        int low =1;
        int high=0;
        for(int i : quantities){
            high=Math.max(high,i);
        }
        int ans=high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(minofmaxproducts(quantities,mid,n)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean minofmaxproducts(int[] quantities , int mid , int n){
        long distribution = 0;
        for(int i : quantities){
            distribution += (i+mid-1)/mid;
        }
        return distribution<=n;
    }
}