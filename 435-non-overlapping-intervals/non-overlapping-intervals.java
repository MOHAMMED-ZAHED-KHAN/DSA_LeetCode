class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (s < end) {
                count++;
                end = Math.min(end, e);
            } else {
                end = e;
            }
        }
        return count;
    }
}