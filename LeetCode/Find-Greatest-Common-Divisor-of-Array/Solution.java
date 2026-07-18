1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int a = nums[0];
5        int b = nums[nums.length - 1];
6        return gcd(a, b);
7
8    }
9
10    public int gcd(int a, int b){
11        while(b != 0){
12            int rem = a % b;
13            a = b;
14            b = rem;
15            gcd(a , b);
16        }
17        return a;
18    }
19}