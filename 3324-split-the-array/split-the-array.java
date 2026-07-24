class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> ele : mpp.entrySet()){
            if(ele.getValue()>2){
                return false;
            }
        }
        return true;
    }
}