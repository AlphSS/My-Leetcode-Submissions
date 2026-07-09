1class Solution {
2    public void moveZeroes(int[] nums) {
3        int left = 0;
4        int right = 1;
5        while (right < nums.length){
6            if(nums[left] == 0 && nums[right] != 0){
7                nums[left] = nums[right];
8                nums[right] = 0;
9                left++;
10            }else if(nums[left] == 0){
11                right++;
12            }else if(nums[left] != 0){
13                left++;
14                right++;
15            }
16        }
17    }
18}