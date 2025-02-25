// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int c=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++)
//         {
//             int v=nums[i];
//             if( v == target)
//                 {
//                     c=Math.min(c,1);
//                     break;
//                 }
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 v=v+nums[j];
//                 if(v > target)
//                 break;
//                 else if( v == target)
//                 {
//                     c=Math.min(c,j-i+1);
//                     break;
//                 }
//             }
//         }
//     if(c==Integer.MAX_VALUE)
//      return 0;
//     else
//      return c;     
        
//     }
// }
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int n=nums.length;
     int min=Integer.MAX_VALUE;
     int s=0;
     int l=0;
     for(int r=0;r<n;r++)
     {
        s+=nums[r];
        while(s>=target)
        {
          min=Math.min(min,r-l+1);  
          s-=nums[l];
          l++;          
        }  
     }
     return (min==Integer.MAX_VALUE)? 0:min;  
    }
}

