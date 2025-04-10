//chat gpt as it also give right answer for 0 but it is not in test case constraints
// class Solution { 
//     public int climbStairs(int n) {
//      int[] dp=new int[n+1];
//      Arrays.fill(dp,-1);
//      dp[0]=0;
//      return fxn(n,dp); 
//     }
//     public int fxn(int n,int[] dp)
//     {
//       if(n==0 || n==1)
//        return 1;
//       if(dp[n]!=-1)
//         return dp[n];
      
//       dp[n]=fxn(n-1,dp)+fxn(n-2,dp);
//       return dp[n];
//     }
// }

// my solution(DP)
class Solution {    
    public int climbStairs(int n) {
    int[] dp=new int [n+1];
    Arrays.fill(dp,-1);
    return fxn(n,dp);
    }
    public int fxn(int n,int[] dp)
    {
       if(n==0 || n==1 || n==2)
        return n;
       if(dp[n]!=-1)
        return dp[n];
       return dp[n]=fxn(n-1,dp)+fxn(n-2,dp);   
    }
}