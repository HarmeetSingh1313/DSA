class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> h=new ArrayList<>();
      int l=0,r=nums.length;
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++)
    {
        l=i+1;
        r=nums.length-1;
        if(i>0 && nums[i]==nums[i-1])
         continue;
      while(l<r)
      { 
        int a=nums[i]+nums[l]+nums[r];
        if(a==0)
        {
          h.add(Arrays.asList(nums[i],nums[l],nums[r]));
          l++;
          r--;

          while(l<r && nums[l]==nums[l-1])
           l++;
          while(l<r && nums[r]==nums[r+1])
           r--; 
        }
        else if(a<0)
         l++;
        else 
         r--;
      }
    }
    return h;
    }
}