class Solution {
    public int myAtoi(String s) {
    int i=0,n=s.length();
    int sign=1; 
    long ans=0;   
    while(i<n && s.charAt(i)==' ')
    {
        i++;
    }
    if((i<n) && (s.charAt(i)=='+' || s.charAt(i)=='-'))
    {
     if(s.charAt(i)=='-')
      sign=-1;
     i++; 
    }
    while(i<n && Character.isDigit(s.charAt(i)))
    {
      ans=ans*10+(s.charAt(i)-'0');
      if(ans>Integer.MAX_VALUE)
       {
        return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
       }
      i++;
    }
    return (int)(ans*sign);  
    }
}