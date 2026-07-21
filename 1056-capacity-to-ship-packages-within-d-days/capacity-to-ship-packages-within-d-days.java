class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low=0;
        int high=0;
        for(int weight : weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(minicapacity(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean minicapacity(int[] weights , int mid , int days){
        int currentload=0;
        int currentday=1;
        for(int weight : weights){
            if((currentload+weight)>mid){
                currentday++;
                currentload=weight;
            }else{
                currentload+=weight;
            }
        }
        return currentday<=days;
    }
}