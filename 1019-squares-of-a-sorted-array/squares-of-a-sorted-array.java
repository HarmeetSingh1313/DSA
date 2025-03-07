//Brute force
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n=nums.length;
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(arr);
//         return arr;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int c=j;
        int[] arr=new int[c+1];
        while(i<=j)
        {
            if((nums[i]*nums[i]) < (nums[j]*nums[j]))
            {
                arr[c]=(nums[j]*nums[j]);
                c--;
                j--;
            }
            else //if((nums[i]*nums[i]) > (nums[j]*nums[j])) not required because whem num[i]=num[j] then it will not run
            {
                arr[c]=(nums[i]*nums[i]);
                c--;
                i++;
            }
        }
    return arr;    
    }
}