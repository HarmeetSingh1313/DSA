class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> h=new ArrayList<>();
    int n=nums.length;
    int l=0,r=0;
    for(int i=0;i<n-3;i++)
    {
        if(i>0 && nums[i]==nums[i-1])
         continue;
        for(int j=i+1;j<n-2;j++)
        {
            if(j>i+1 && nums[j]==nums[j-1])
             continue;
            l=j+1;
            r=n-1;
            while(l<r)
            {
                long a=(long) nums[i]+nums[j]+nums[l]+nums[r];

                if(a==target)
                {
                  h.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                  l++;
                  r--;
                  while(l<r && nums[l]==nums[l-1])
                   l++;
                  while(l<r && nums[r]==nums[r+1])
                   r--;
                }
                else if(a<target)
                {
                    l++;
                }
                else 
                {
                 r--;
                }
            }
        }
    }  
    return h;  
    }
}