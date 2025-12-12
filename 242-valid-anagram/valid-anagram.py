class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
         return False

        dic = {}

        for c in s:
            dic[c] = dic.get(c,0)+1

        for c in t:
            if c not in dic:
                return False
            dic[c]=dic[c]-1
            if dic[c]==0:
                del dic[c]

        return len(dic) == 0     


        