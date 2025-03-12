class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i1=0,j1=nums1.length;
    int i2=0,j2=nums2.length;
    int[] arr=new int[nums1.length+nums2.length];
    int c=0;
    while(i1<j1 && i2<j2)
    {
      if(nums1[i1]<nums2[i2])
      {
        arr[c]=nums1[i1];
        c++;
        i1++;
      }
      else
       {
        arr[c]=nums2[i2];
        i2++;
        c++;
       }
    }
    if(i1<j1)
    {
        while(i1<j1)
        {
         arr[c]=nums1[i1];
         i1++;
         c++;   
        }
    }
    else
    {
        while(i2<j2)
        {
          arr[c]=nums2[i2];
          c++;
          i2++;  
        }
    }
    
    if(arr.length%2==0)
    {
       return ((arr[arr.length/2]+arr[(arr.length/2)-1])/2.0);
    }
    else
     return (arr[arr.length/2]);

    }
}