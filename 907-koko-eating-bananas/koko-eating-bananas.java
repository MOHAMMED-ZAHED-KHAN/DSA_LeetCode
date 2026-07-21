class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low=1;
        int high=0;
        // int ans=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(caneatallbananas(piles,mid,h)){
                // ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean caneatallbananas(int[] piles , int mid , int h){
        long totalh=0;
        for(int pile:piles){
            totalh+=(pile+mid-1)/mid;
        }
        return totalh<=h;
    }
}