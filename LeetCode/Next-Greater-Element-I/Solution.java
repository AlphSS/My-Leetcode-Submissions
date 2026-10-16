1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        
4        Stack<Integer> st = new Stack<>();
5        int[] ans = new int[nums1.length];
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for(int i = 0; i < nums2.length; i++){
9            while(!st.isEmpty() && st.peek() < nums2[i]){
10                map.put(st.peek(), nums2[i]);
11                st.pop();
12            }
13            st.push(nums2[i]);
14        }
15
16        for(int i = 0; i < nums1.length; i++){
17            if(!map.containsKey(nums1[i])){
18                ans[i] = -1;
19            }else{
20                ans[i] = map.get(nums1[i]);
21            }
22        }
23        return ans;
24    }
25}
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44// int[] ans = new int[nums1.length];
45// for (int i = 0; i < nums1.length; i++) {
46//     boolean found = false;
47//     ans[i] = -1;
48//     for (int j = 0; j < nums2.length; j++) {
49//         if (nums2[j] == nums1[i]) {
50//             for (int k = j + 1; k < nums2.length; k++) {
51//                 if (nums1[i] < nums2[k]) {
52//                     found = true;
53//                 }
54
55//                 if (found) {
56//                     ans[i] = nums2[k];
57//                     break;
58//                 }
59//             }
60//         }
61//     }
62// }
63// return ans;