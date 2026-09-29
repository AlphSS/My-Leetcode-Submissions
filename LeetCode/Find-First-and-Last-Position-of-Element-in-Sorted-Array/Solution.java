1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = -1;
4        int last = -1;
5
6        int left = 0;
7        int right = nums.length - 1;
8        while (left <= right) {
9            int mid = left + (right - left) / 2;
10            if (nums[mid] == target) {
11                first = mid;
12                right = mid - 1;
13            } else if (nums[mid] < target) {
14                left = mid + 1;
15            } else {
16                right = mid - 1;
17            }
18        }
19        
20        left = 0;
21        right = nums.length - 1;
22
23        while (left <= right) {
24            int mid = left + (right - left) / 2;
25            if (nums[mid] == target) {
26                last = mid;
27                left = mid + 1;
28            } else if (nums[mid] < target) {
29                left = mid + 1;
30            } else {
31                right = mid - 1;
32            }
33        }
34        return new int[] { first, last };
35    }
36}