1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] ans = new int[2 * nums.length];
4        for(int i = 0; i < nums.length; i++){
5            ans[i] = nums[i];
6            ans[i + nums.length] = nums[i];
7        }
8        return ans;
9    }
10}