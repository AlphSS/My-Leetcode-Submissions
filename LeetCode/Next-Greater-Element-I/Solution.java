1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int[] ans = new int[nums1.length];
4        for (int i = 0; i < nums1.length; i++) {
5            boolean found = false;
6            ans[i] = -1;
7            for (int j = 0; j < nums2.length; j++) {
8                if (nums2[j] == nums1[i]) {
9                    for (int k = j + 1; k < nums2.length; k++) {
10                        if (nums1[i] < nums2[k]) {
11                            found = true;
12                        }
13
14                        if (found) {
15                            ans[i] = nums2[k];
16                            break;
17                        }
18                    }
19                }
20
21            }
22        }
23        return ans;
24    }
25}