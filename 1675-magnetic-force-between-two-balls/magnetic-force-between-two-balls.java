class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low=1;
        int high=position[n-1]-position[0];
        int ans =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(maxamongminforce(position,mid,m)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean maxamongminforce(int[] arr , int mid , int m){
        int balls=1;
        int lastposition=arr[0];
        for(int i=1;i<arr.length;i++){
            if((arr[i]-lastposition)>=mid){
                balls++;
                lastposition=arr[i];
            }
        }
        return balls>=m;
    }
}