1class Solution {
2    public void sortColors(int[] nums) {
3        int countZeros = 0;
4        int countOnce = 0;
5        int countTows = 0;
6        for(int i = 0; i <= nums.length - 1; i++){
7            if(nums[i]==0) countZeros++;
8            if(nums[i]==1) countOnce++;
9            if(nums[i]==2) countTows++;
10        }
11
12        int i = 0;
13        while(countZeros > 0){
14            nums[i] = 0;
15            i++;
16            countZeros--;
17        }
18        while(countOnce > 0){
19            nums[i] = 1;
20            i++;
21            countOnce--;
22        }
23        while(countTows > 0){
24            nums[i] = 2;
25            i++;
26            countTows--;
27        }
28    }
29}