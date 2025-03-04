class Solution {
    public int search(int[] nums, int target) {
     int s=0,e=nums.length-1;
     if(nums.length<2)
      return (nums[0]==target)?0:-1;
     while(s<e)
     {
        int mid=(s+e)/2;
        if(nums[mid]>nums[e])
        {
            s=mid+1;
        }
        else
         e=mid;
     }
    int pivot=s;
    s=0;
    e=nums.length-1;
    if(nums[pivot]<target && nums[e]<target)
    {
        e=pivot-1;
    }
    else
    {
        s=pivot;
    }

     while(s<=e)
     {
        int mid=(s+e)/2;
        if(nums[mid]==target)
        {
          return mid;
        }
        else if(nums[mid]>target)
        {
          e=mid-1;
        }
        else 
         s=mid+1;        
     }
    return -1;    
    }
}