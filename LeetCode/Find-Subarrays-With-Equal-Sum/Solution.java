1class Solution {
2    public boolean findSubarrays(int[] nums) {
3        HashSet<Integer> duplicateExists = new HashSet<>();
4        int firstPointer = 0;
5        int secondPointer = 1;
6
7        while(secondPointer < nums.length){
8            int sum = nums[firstPointer] + nums[secondPointer];
9
10            if(duplicateExists.contains(sum)){
11                return true;
12            }else{
13                duplicateExists.add(sum);
14                firstPointer++;
15                secondPointer++;
16            }
17        }
18        return false;
19    }
20}