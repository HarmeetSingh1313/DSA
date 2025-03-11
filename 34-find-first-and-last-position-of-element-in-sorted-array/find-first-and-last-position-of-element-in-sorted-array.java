// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int n=nums.length-1;
//         int l=0;
//         int h=n;
//         int x=-1,y=-1,a=-1;
//         int mid=0;
//         while(l<=h)
//         {
//             mid=(l+h)/2;
//             if(nums[mid]==target)
//             {
//                 a=mid;
//                 while(nums[a]==target)
//                 {
//                     x=a;
//                     if(a-1>=0 && nums[a] == target)
//                     {
//                         a--;
//                         if( nums[a]==target)
//                         x=a;
//                     }    
//                     else
//                     break;
                    
//                 }
//                 a=mid;
//                 while(nums[a]==target)
//                 {
//                     y=a;
//                     if(a+1<=h && nums[a]==target)
//                     {
//                       a++;  
//                       if( nums[a]==target)
//                       y=a;
//                     }
//                     else
//                     break;
                    
//                 }
//             }    
               
//             if(nums[mid]>target)
//             {
//                 h=mid-1;
//             }
//             else
//             {
//                 l=mid+1;
//             }
        
//         }
//     int[] arr ={x,y};    
//     return arr;
//     }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length;
        int i1=-1,j1=-1;
        int p=-1;
        while(i<j)
        {
          int mid=i+(j-i)/2;  
         if(nums[mid]==target)
          {
             p=mid;
             break;
          }
         else if(nums[mid]<target) 
         {
            i=mid+1;
         }
         else
          j=mid;
        }
        if(p!=-1)
        {
            i=0;
            i1=p;
            j=p;
            while(i<=j)
            {
                int mid=i+(j-i)/2;
                if(nums[mid]==target)
                {
                    i1=mid;
                    j=mid-1;
                }
                else if(nums[mid]<target)
                {
                    i=mid+1;
                }
                else 
                 j=mid-1;
            }

            i=p;
            j1=p;
            j=nums.length-1;
            while(i<=j)
            {
                int mid=i+(j-i)/2;
                if(nums[mid]==target)
                {
                    j1=mid;
                    i=mid+1;
                }
                else if(nums[mid]<target)
                {
                    i=mid+1;
                }
                else 
                 j=mid-1;
            }
        }
    int[] arr={i1,j1};    
    return arr;
    }
}