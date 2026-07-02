class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }
        int[] ans = new int[nums.length];
        if (zeroCount > 1) {
            return ans;   
        }
        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    ans[i] = product;
            }
            return ans;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = product / nums[i];
        }
        return ans;
    }
}