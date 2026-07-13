1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int left = 0;
4        int right = 0;
5        int n = nums.length;
6        while(right < n){
7            if(nums[right] == val){
8                right++;
9            }else{
10                nums[left] = nums[right];
11                left++;
12                right++;
13            }
14        }
15        return (left);
16    }
17}