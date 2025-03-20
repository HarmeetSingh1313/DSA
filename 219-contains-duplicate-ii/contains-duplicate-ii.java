//Time Limit Exceeded for large input
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//      boolean f=false;
//      for(int i=0;i<nums.length;i++)
//      {
//         for(int j=i+1;j<nums.length;j++)
//         {
//            if(nums[i]==nums[j] && j-i<=k)
//            {
//             return true;
//            }
//         }
//       } 
//     return f;     
//     }
// }


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer,Integer> h=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        if( (h.containsKey(nums[i])) && (i-h.get(nums[i])<=k))
         return true;
        h.put(nums[i],i); 
     }
     return false;     
    }
}




