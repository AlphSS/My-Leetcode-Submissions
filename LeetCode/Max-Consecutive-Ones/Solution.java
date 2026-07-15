1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0;
4        int maxCount = 0;
5        int left = 0;
6        while( left < nums.length){
7            if(nums[left] == 1){
8                count++;
9                left++;
10            }else{
11                if(maxCount < count){
12                    maxCount = count;
13                }
14                count = 0;
15                left++;
16            }
17        }
18
19        if(maxCount < count){
20            maxCount = count;
21        }
22        return maxCount;
23    }
24}