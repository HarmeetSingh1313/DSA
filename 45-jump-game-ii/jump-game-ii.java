class Solution {
    public int jump(int[] nums) {
    int n=nums.length;
    int c=0,fi=0,ci=0;   //ci=current index , fi=farthest index ,c=count
    if(n==1)
     return 0;
    for(int i=0;i<n;i++)
    {
      fi=Math.max(fi,i+nums[i]);
      if(i==ci)
      {
         c++;
         ci=fi;
         if(fi>=n-1)
          break;
      }
    }
    return c;     
    }
}