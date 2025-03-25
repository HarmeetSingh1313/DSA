class Solution {
    public int scoreOfString(String s) {
     char[] arr=s.toCharArray();
     int s1=0;
     for(int i=0;i<s.length()-1;i++)
     {
        int x1=arr[i];
        int x2=arr[i+1];
      s1+=Math.abs(x1-x2);  
     }
    return s1;    
    }
}