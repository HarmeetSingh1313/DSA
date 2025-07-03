class Solution {
    public String[] findWords(String[] words) {
      HashMap<Character,Integer> h=new HashMap<>();  
      String[] row={"qwertyuiop","asdfghjkl","zxcvbnm"};
      for(int i=0;i<3;i++)
      {
        for(char c:row[i].toCharArray())
        {
            h.put(c,i);  
        }
      }
      List<String> l=new ArrayList<>();
      for(String s:words)
      {
        String ls=s.toLowerCase();
        int target=h.get(ls.charAt(0));
        boolean b=true;
        for(int i=1;i<ls.length();i++)
        {
            if(h.get(ls.charAt(i))!=target)
            {
                b=false;
                break;
            }
        }
        if(b==true)
        l.add(s);
      }
    return (l.toArray(new String[l.size()]));
    }
}