1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length - 1;
5        int sum = 0;
6        int indices[] = new int[2];
7        while(left < right){
8            sum = numbers[left] + numbers[right];
9            if(sum == target){
10                indices[0] = left + 1;
11                indices[1] = right + 1;
12                break;
13            }else if(sum < target){
14                left++;
15            }else if(sum > target){
16                right--;
17            }
18        }
19        return indices;
20    }
21}