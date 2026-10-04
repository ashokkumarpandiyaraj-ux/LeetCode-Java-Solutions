class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (nums[j] < nums[i]) {
                    c = c + 1;
                }
            }
            a[i] = c;
        }
        return a;
    }
}
