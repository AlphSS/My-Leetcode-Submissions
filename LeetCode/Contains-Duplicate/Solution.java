1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> map = new HashSet<>();
4        for(int i = 0; i < nums.length; i++){
5            if(map.contains(nums[i])){
6                return true;
7            }
8            map.add(nums[i]);
9        }
10        return false;
11    }
12}