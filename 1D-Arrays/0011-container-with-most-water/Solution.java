class Solution {
    public int maxArea(int[] a) {
        int l = 0;
        int r = a.length - 1;
        int m = 0;
        while (l < r) {
            int c = Math.min(a[l], a[r]) * (r - l);
            m = Math.max(c, m);
            if (a[l] < a[r]) {
                l++;
            } else {
                r--;
            }
        }
        return m;
    }
}
