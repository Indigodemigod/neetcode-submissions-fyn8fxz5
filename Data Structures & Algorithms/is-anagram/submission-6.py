class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        char_s = sorted(s)
        char_t = sorted(t)
        for i in range(0, len(char_s)):
            if char_s[i] != char_t[i]:
                return False
        return True