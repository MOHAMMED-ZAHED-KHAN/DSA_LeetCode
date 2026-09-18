class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ps=0;
        int count=0;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        mapp.put(0,1);
        for(int i=0;i<n;i++){
            ps+=nums[i];
            if(mapp.containsKey(ps-k)){
                count+=mapp.get(ps-k);
            }
            mapp.put(ps,mapp.getOrDefault(ps,0)+1);
        }
        return count;
    }
}