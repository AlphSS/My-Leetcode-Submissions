1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int left = 0;
4        int right = 1;
5        int n = nums.length;
6        while(right < n){
7            if(nums[left] != nums[right]){
8                left++;
9                nums[left] = nums[right];
10                right++;
11            }else{
12                right++;
13            }
14        }
15        return (left + 1);
16    }
17}