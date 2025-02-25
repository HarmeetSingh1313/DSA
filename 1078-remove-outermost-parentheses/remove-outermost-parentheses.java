class Solution {
    public String removeOuterParentheses(String s) {
    char[] arr=s.toCharArray();
    int n=arr.length;
    int c=0;
    int n1=0;
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++)
    {
      if(arr[i]=='(' )
      {
        c++;
        if(c>1)
        s1.append("(");
      }
      else if(arr[i]==')')
      {
        c--;
        n1++;
        if(c>0)
        s1.append(")");
      }
      
    }
    String s2=new String(s1);
    return s2;   
    }
}