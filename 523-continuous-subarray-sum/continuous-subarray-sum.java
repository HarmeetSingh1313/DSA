// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int s=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++)
//         {
//             s=nums[i];
//             for(int j=i+1;j<n;j++)
//             {
//              s+=nums[j];
//              if(s%k==0)
//               return true;   
//             }
//         }
//     return false;    
//     }
// }


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> h =new HashMap<>();
    int n=nums.length,s=0;
    h.put(0,-1);
    for(int i=0;i<n;i++)
    {
       s+=nums[i];
       int mod=s%k;
       if(h.containsKey(mod))
       {
         if(i-(h.get(mod) )> 1)
         {
            return true;
         }
       }
       else
       {
        h.put(mod,i);
       }
    }
    return false;
    }
}