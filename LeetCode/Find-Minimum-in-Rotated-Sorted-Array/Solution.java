1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int high = nums.length - 1;
5        int mid;
6        while(left < high){
7            mid = left + (high - left) / 2;
8            if(nums[mid] > nums[high]) left = mid + 1;
9            else high = mid;
10        }
11        return nums[left];
12    }
13}