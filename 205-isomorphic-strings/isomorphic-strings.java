class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        if (s.length() != t.length())
         return false;
        for(int i=0;i<s.length();i++)
        {
            char a1=s.charAt(i);
            char a2=t.charAt(i);

            if(h1.containsKey(a1))
            {
                if(h1.get(a1)!=a2)
                  return false;
            }
            else
              h1.put(a1,a2);

            if(h2.containsKey(a2))
            {
                if(h2.get(a2)!=a1)
                 return false;
            }
            else
              h2.put(a2,a1);
        }
    return true;    
    }
}