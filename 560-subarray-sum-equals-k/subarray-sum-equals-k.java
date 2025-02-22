class Solution {
    public int subarraySum(int[] nums, int k) {
       int n =nums.length;
       int s=0;
       int c=0;
       for(int i=0;i<n;i++) 
       {
         s=nums[i];
         if(s==k)
         {
          c++;
         } 
        for(int j=i+1;j<n;j++)
        {
          s+=nums[j];
          if(s==k)
          {
          c++;
          }
        }
       }
    return c;    
    }
}