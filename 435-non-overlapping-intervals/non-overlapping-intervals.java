class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int count = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (s < end) {
                count++;
                end = Math.min(end, e);
            } else {
                ArrayList<Integer> small = new ArrayList<>();
                small.add(start);
                small.add(end);
                ans.add(small);
                start = s;
                end = e;
            }
        }
        ArrayList<Integer> small = new ArrayList<>();
        small.add(start);
        small.add(end);
        ans.add(small);
        return count;
    }
}