class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long flowersrequired = (long) m*k;
        if(flowersrequired>n){
            return -1;
        }
        int ans=-1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canmakebouquets(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean canmakebouquets(int[] bloomDay , int mid , int m , int k){
        int flowercount = 0;
        int bouquets = 0;
        for(int day : bloomDay){
            if(day<=mid){
                flowercount++;
                if(flowercount==k){
                    flowercount=0;
                    bouquets++;
                }
            }else{
                flowercount=0;
            }
        }
        return bouquets>=m;
    }
}