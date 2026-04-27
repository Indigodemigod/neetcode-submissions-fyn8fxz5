class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int idx = 0;
        int[] s1Freq = new int[26];
        for(char c: s1.toCharArray()){
            s1Freq[c - 'a']++;
        }
        while(idx + s1Length <= s2Length){
            String temp = s2.substring(idx, idx + s1Length);
            char[] tempFreq = temp.toCharArray();
            int[] s2Freq = new int[26];
            for(char c: tempFreq){
                s2Freq[c - 'a']++;
            }
            boolean flag = true;
            for(int i = 0; i < 26; i++){
                if(s1Freq[i] != s2Freq[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return true;
            }
            idx = idx + 1;
        }
        return false;
    }
}
