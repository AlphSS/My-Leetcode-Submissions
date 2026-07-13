1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        for (int i = 0; i < nums.length - 1; i++) {
6            if(i > 0 && nums[i] == nums[i - 1]) continue;
7            
8            int left = i + 1;
9            int right = nums.length - 1;
10            while (left < right) {
11                int sum = nums[i] + nums[left] + nums[right];
12                if (sum == 0) {
13                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
14                    while(left < right && nums[left] == nums[left + 1]) left++;
15                    while(left < right && nums[right] == nums[right - 1]) right--;
16                    left++;
17                    right--;
18                } else if (sum < 0) {
19                    left++;
20                } else if (sum > 0) {
21                    right--;
22                }
23            }
24        }
25        return result;
26    }
27}