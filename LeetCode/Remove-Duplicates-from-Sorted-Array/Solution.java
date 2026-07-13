1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int left = 0;
4        int right = 1;
5        while(right < nums.length){
6            if(nums[left] != nums[right]){
7                left++;
8                nums[left] = nums[right];
9                right++;
10            }else{
11                right++;
12            }
13        }
14        return (left + 1);
15    }
16}