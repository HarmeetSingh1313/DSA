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
            boolean t=true;
            for(int j=0;j<s.length();j++)
            {
                if(!h.contains (s.charAt(j)) ) 
                {
                  t=false;
                  break;
                }
            }
        if(t)
         c++;     
        }    
    return c;
    }
}