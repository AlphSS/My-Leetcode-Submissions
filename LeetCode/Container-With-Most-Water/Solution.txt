1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int area = 0;
6        int currentArea = 0;
7        while(left < right){
8            if(height[left] < height[right]){
9                currentArea = height[left] * (right - left);
10            }else{
11                currentArea = height[right] * (right - left);
12            }
13            if(area < currentArea){
14                area = currentArea;
15            }
16            if(height[left] < height[right])
17                left ++;
18            else
19                right--;
20        }
21        return area;
22    }
23}