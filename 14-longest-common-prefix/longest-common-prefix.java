class Solution {
    public String longestCommonPrefix(String[] strs) {
    int n=strs.length;
    int n1=Integer.MAX_VALUE;
    int j=0,c=0;
    int k=0;
    StringBuilder s1=new StringBuilder();
    if(n==1)
     return strs[0];
    while(j<n)
    {
     n1=Math.min(n1,strs[j].length());
     j++;
    }
    for(int i=0;i<n1;i++)
    {
      c=0;
      j=0;
      if(k==1)
       break;  
      while(j+1<n)
      {
       if(strs[j].charAt(i)==strs[j+1].charAt(i))
       {
        c++;
        j++;
       }
       else
       {
        k=1;
        break;
       }
       if(c==n-1)
       { 
       s1.append(strs[j].charAt(i));
       }
      }

    }
    String s2=new String(s1);
    return s2;
    }
}