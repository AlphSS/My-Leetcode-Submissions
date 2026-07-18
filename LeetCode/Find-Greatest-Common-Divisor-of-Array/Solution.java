1class Solution {
2    public int findGCD(int[] nums) {
3        int a = nums[0];
4        int b = nums[0];
5
6        for(int i = 0; i < nums.length; i++){
7            if(a > nums[i]){
8                a = nums[i];
9            }
10
11            if(b < nums[i]){
12                b = nums[i];
13            }
14
15        }
16        return gcd(a, b);
17
18    }
19
20    public int gcd(int a, int b){
21        while(b != 0){
22            int rem = a % b;
23            a = b;
24            b = rem;
25            gcd(a , b);
26        }
27        return a;
28    }
29}