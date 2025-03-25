class Solution {
    public int strStr(String haystack, String needle) {
     int n1=haystack.length();
     int n2=needle.length();
    if(n1<n2)
     return -1;
    for(int i=0;i<=n1-n2;i++)   //<= because when we are doing i+j j can be max n2-1 so to reach till last i should go to i<=n1-n2
    {
      int j=0;  
      for(j=0;j<n2;j++)
      {
        if(haystack.charAt(i+j)!=needle.charAt(j))
         break; 
      }
      if(j==n2)  // j is equal to n2 only when j is loop executed completely and at last it increment j and we get j==n2 where as when if statement in loop j is executed maximum j can be n2-1
       return i;
    }
    return -1;       
    }
}