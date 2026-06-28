class MaximumElementAfterDecrementingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        
        int prev = 0;
        for (int val : arr) {
            prev = Math.min(val, prev + 1);
        }
        
        return prev;
    }
}
