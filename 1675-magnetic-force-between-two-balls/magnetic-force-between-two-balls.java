class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n  = position.length;
        int low=1;
        int high=position[n-1]-position[0];
        // int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(miniforce(position,mid,m)){
                // ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public boolean miniforce(int[] position , int mid , int m){
        int lastposition = position[0];
        int balls=1;
        for(int i=1;i<position.length;i++){
            if((position[i]-lastposition)>=mid){
                balls++;
                lastposition=position[i];
            }
        }
        return balls>=m;
    }
}