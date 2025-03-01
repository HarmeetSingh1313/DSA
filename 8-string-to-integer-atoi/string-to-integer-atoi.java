class Solution {
    public int myAtoi(String s) {
    int i=0,n=s.length();
    int sign=1; 
    long ans=0;   
    while(i<n && s.charAt(i)==' ')
    {
        i++;
    }
    if((i<n) && (s.charAt(i)=='+' || s.charAt(i)=='-'))  //mistake due to () as i not add this () which leads to precedence issue
    {
     if(s.charAt(i)=='-')
      sign=-1;
     i++; 
    }
    while(i<n && Character.isDigit(s.charAt(i)))
    {
      ans=ans*10+(s.charAt(i)-'0');
      if(ans>Integer.MAX_VALUE)   //to check overflow 
       {
        return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
       }
      i++;                 // earlier mistake:- not incrementing this which leads to TLE(time limit exceed)
    }
    return (int)(ans*sign);  
    }
}