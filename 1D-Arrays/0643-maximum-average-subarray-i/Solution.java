class Solution {
    public double findMaxAverage(int[] a, int k) {
        int s = 0;
        // First window
        for (int i = 0; i < k; i++) {
            s += a[i];
        }
        int max = s;
        // Sliding window
        for (int i = k; i < a.length; i++) {
            s = s - a[i - k] + a[i];
            max = Math.max(s, max);
        }
        return (double) max / k;
    }
}
