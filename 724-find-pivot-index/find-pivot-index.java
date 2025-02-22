class Solution {
    public int pivotIndex(int[] nums) {
    int n=nums.length;
    int ts1=0;
    int ls=0;
    int[] ts=new int[n];
    for(int i=0;i<n;i++)
    {
       ts1+=nums[i];
       ts[i]=ts1; 
    }
    for(int i=0;i<n;i++)
    {
        if(i>0)
         ls=ts[i-1];
        if(ls==ts1-ts[i])
         return i;
    }
   return -1;
   }
}