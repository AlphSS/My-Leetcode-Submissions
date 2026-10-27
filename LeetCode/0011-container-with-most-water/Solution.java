class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int currentArea = 0;
        while(left < right){
            if(height[left] < height[right]){
                currentArea = height[left] * (right - left);
            }else{
                currentArea = height[right] * (right - left);
            }
            if(area < currentArea){
                area = currentArea;
            }
            if(height[left] < height[right])
                left ++;
            else
                right--;
        }
        return area;
    }
}