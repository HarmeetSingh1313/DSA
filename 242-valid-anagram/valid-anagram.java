class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> h=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
    }
    for(int i=0;i<t.length();i++)
    {
        if(h.containsKey(t.charAt(i)))
        { 
         int x=h.get(t.charAt(i))-1;
         if(x==0)
         {
          h.remove(t.charAt(i));
         }
         else if(x>0)
          h.put(t.charAt(i),x);
         else 
          return false;
        }
        else
         return false;  
    }
 return h.isEmpty();   
 }      
}