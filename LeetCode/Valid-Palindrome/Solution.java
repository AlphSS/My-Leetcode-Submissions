1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5
6        while (left < right){
7            if(!Character.isLetterOrDigit(s.charAt(left))){
8                left++;
9            }else if(!Character.isLetterOrDigit(s.charAt(right))){
10                right--;
11            }else if( Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
12                return false;
13            }else{
14                left++;
15                right--;
16            }
17        }
18        return true;
19    }
20}