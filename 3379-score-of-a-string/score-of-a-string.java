class Solution {
    public int scoreOfString(String s) {
     char[] arr=s.toCharArray();        //not required this as we can directly use string
     int sum=0;
     for(int i=0;i<s.length()-1;i++)
     {
        //int x1=arr[i];
        //int x2=arr[i+1];
      sum+=Math.abs(arr[i]-arr[i+1]);  // we can also diretly use string
     }                                 // like this Math.abs(s.charAt(i)-s.charAt(i+1))
    return sum;    
    }
}