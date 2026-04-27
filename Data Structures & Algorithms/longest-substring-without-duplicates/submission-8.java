class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 1;
        if(s.length() <= 1){
            return s.length();
        }
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while(map.get(s.charAt(right)) > 1){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
