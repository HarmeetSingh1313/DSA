class Solution {
    public boolean isPalindrome(String s) {
    char[] arr=s.toCharArray();
    int c=0;
    StringBuilder s1= new StringBuilder();
    for(int i=0;i<arr.length;i++)
    {
        if(47 < arr[i]  && arr[i] < 58    || 64 < arr[i]  && arr[i] < 91 || 96 < arr[i] && arr[i] <123)
        {
          s1.append(arr[i]);
        }
    }
    String s2=new String(s1);
    String s3=new String(s2.toLowerCase());
    for(int i=0;i<s3.length()/2;i++)
    {
      if(s3.charAt(i) == s3.charAt(s3.length()-1-i))
       c++;   
    } 
    return (c==s3.length()/2);   
    }
}