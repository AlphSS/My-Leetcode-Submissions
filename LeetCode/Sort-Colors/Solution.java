1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int right = nums.length - 1;
6
7        while(mid <= right){
8            if(nums[mid] == 1){
9                mid++;
10            }else if(nums[mid] == 0){
11                int temp = nums[mid];
12                nums[mid] = nums[low];
13                nums[low] = temp;
14                low++;
15                mid++;
16            }else{
17                int temp = nums[mid];
18                nums[mid] = nums[right];
19                nums[right] = temp;
20                right--;
21
22            }
23        }
24    }
25}