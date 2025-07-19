class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> h=new HashSet<>();
        int c=0;
        for(int i=0;i<allowed.length();i++)
        {
           h.add(allowed.charAt(i)); 
        }
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            int t=0;
            for(int j=0;j<s.length();j++)
            {
                if(h.contains (s.charAt(j)) ) 
                 t++;
                if(t==s.length())
                 c++;     
            }
        }
    return c;
    }
}