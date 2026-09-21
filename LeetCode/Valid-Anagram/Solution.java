1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4        HashMap<Character, Integer> map1 = new HashMap<>();
5        HashMap<Character, Integer> map2 = new HashMap<>();
6
7        for(int i = 0; i < s.length(); i++){
8            if(!map1.containsKey(s.charAt(i))) {
9                map1.put(s.charAt(i), 1);
10            }else{
11                Integer value = map1.get(s.charAt(i));
12                map1.put(s.charAt(i), value + 1);
13            }
14        }
15
16        for(int i = 0; i < t.length(); i++){
17            if(!map2.containsKey(t.charAt(i))) {
18                map2.put(t.charAt(i), 1);
19            }else{
20                Integer value = map2.get(t.charAt(i));
21                map2.put(t.charAt(i), value + 1);
22            }
23        }
24
25        if(map1.equals(map2)) return true;
26        return false;
27    }
28}