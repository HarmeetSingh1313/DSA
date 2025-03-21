class Solution {
    public boolean isPalindrome(int x) {
     int y=x;
     int t=0;
     if(x<0)
      return false;
     while(y!=0)
     {
        t=t*10+y%10;
        y=y/10;
     }
    return x==t;  
    }
}