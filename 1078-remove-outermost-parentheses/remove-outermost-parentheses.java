//ChatGpt
// class Solution { 
//     public String removeOuterParentheses(String s) {
//         StringBuilder s1 = new StringBuilder();
//         int count = 0;  // Counter to track the depth of parentheses

//         for (char ch : s.toCharArray()) {
//             if (ch == '(') {
//                 if (count > 0) s1.append(ch);  // Add only if it's not an outer '('
//                 count++;
//             } else { // ch == ')'
//                 count--;
//                 if (count > 0) s1.append(ch);  // Add only if it's not an outer ')'
//             }
//         }
//         return s1.toString();
//     }
// }

class Solution {
    public String removeOuterParentheses(String s) {
    char[] arr=s.toCharArray();
    int n=arr.length;
    int c=0;
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++)
    {
      if(arr[i]=='(' )
      {
        if(c>0)
        s1.append("(");
        c++;
      }
      else if(arr[i]==')')
      {
        c--;
        if(c>0)
        s1.append(")");
      }
      
    }
    String s2=new String(s1);
    return s2;   
    }
}