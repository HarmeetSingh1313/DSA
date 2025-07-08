class Solution {
    public int lengthOfLastWord(String s) {
    int n=s.length(),c=0,i=n-1;
            while(i>=0 && s.charAt(i)==' ')
            {
              i--;
            }
            while(i>=0 && s.charAt(i)!=' ')
            {
              c++;
              i--;
            } 
    return c;           
    }
}