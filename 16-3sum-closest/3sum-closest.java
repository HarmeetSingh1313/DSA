// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//      Arrays.sort(nums);
//      int clsum=nums[0]+nums[1]+nums[2];
//      for(int i=0;i<nums.length-2;i++)
//      {
//         int l=i+1,r=nums.length-1;

//         while(l<r)
//         {
//             int csum=nums[i]+nums[l]+nums[r];
//             if(Math.abs(csum-target)<Math.abs(clsum-target))
//              clsum=csum;
//             if(csum<target) 
//              l++;
//             else if(csum>target)
//              r--;
//             else
//              return target;  
//         }
//      }
//     return clsum; 
//     }
// }

class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int n=nums.length;
    int j=1,k=n-1;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n-2;i++)
    {
      j=i+1;
      k=n-1;  
    while(i<j && j<k)
    {
      int v=nums[i]+nums[j]+nums[k];
      if(Math.abs(target-v)<Math.abs(target-min))
      {
        min=v;
      }
      if(v<target)
      {
         j++;
      }
      else
       k--;
      }
    }
    return min;
    }
}